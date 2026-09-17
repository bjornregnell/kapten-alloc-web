# TimeEdit CSV Fetch Investigation

## Problem

The feature that checks consistency between hard-coded schedule data and the live TimeEdit schedule broke because TimeEdit (cloud.timeedit.net) introduced a login requirement for CSV access.

The app (`main.scala`) fetches:
```
https://cloud.timeedit.net/lu/web/lth1/ri19566250000YQQ28Z0507007y9Y4763gQ0g5X6Y65ZQ176.csv
```

Users see the error: **"TimeEdit i molnet svara inte just nu"**

Even when logged into `cloud.timeedit.net` in another Firefox tab, the fetch from the app (hosted on `fileadmin.cs.lth.se`) still fails.

## Root Cause

The `XMLHttpRequest` in `TimeEdit.scala` is a cross-origin request from `fileadmin.cs.lth.se` to `cloud.timeedit.net`. Two browser mechanisms block it:

1. **SameSite cookie policy** — session cookies from the TimeEdit login are not sent with cross-origin XHR requests.
2. **CORS** — TimeEdit's server does not return `Access-Control-Allow-Origin` or `Access-Control-Allow-Credentials` headers, so the browser blocks the response.

## Options Considered

### Option 1: File upload (not chosen — burdens users)
Add a file `<input>` so users download the CSV manually from TimeEdit and upload it to the app. The app reads it locally via `FileReader`. No network request to TimeEdit needed. Always works, but requires manual steps from users.

### Option 2: `withCredentials = true` on the XHR (tried, failed)
Set `request.withCredentials = true` to instruct the browser to include cookies in the cross-origin request. Implemented in commit `a96854f`.

**Result:** Did not work. HAR analysis showed:
- `"cookies": []` — Firefox's Total Cookie Protection partitions third-party cookies, so the TimeEdit session cookies were never attached.
- TimeEdit responded with **HTTP 412** and **no CORS headers** — `Access-Control-Allow-Origin` was absent, causing a "CORS Missing Allow Origin" error.
- TimeEdit does not support cross-origin requests at all.

The `withCredentials = true` change was kept as it is harmless (fully backwards compatible if TimeEdit ever removes the login requirement).

### Option 3: Server-side proxy (not yet implemented)
Host a proxy on a server that fetches from TimeEdit server-side and relays the CSV. Requires server access and managing authentication.

### Option 4: Host a periodically refreshed CSV on fileadmin (under consideration)
Periodically update a copy of the TimeEdit CSV on `fileadmin.cs.lth.se`. The app fetches from there instead of directly from TimeEdit. No CORS or auth issues. Main trade-off is data staleness.

To implement: change `timeEditScheduleUrl` in `main.scala:15` to point to the hosted copy.

## Current State (as of 2026-05-21)

- `withCredentials = true` is set but the fetch still fails due to TimeEdit's CORS policy.
- The app falls back to showing "TimeEdit i molnet svara inte just nu" and continues with locally hard-coded data.
- Option 4 (hosted CSV on fileadmin) is the preferred path forward, pending a decision on update frequency.
