# kapten-alloc-web

This single-page client-only web app is available for download and execution in you browser here: https://fileadmin.cs.lth.se/pgk/kaptenalloc/
There you can filter the schedule of this course: https://cs.lth.se/pgk

The app also attempts to fetch the updated schedule from TimeEdit on page load in order to check for discrepancies between the saved data and TimeEdit. For this to work, the correct TimeEdit schedule URL must be set in `main.scala`, as shown here:
```scala
val timeEditScheduleUrl = "https://cloud.timeedit.net/lu/web/lth1/XXXXXXXXXXX.csv"
```

The static allocation data string is created by the closed source terminal app called [Kapten Alloc](http://www.nissepedia.com/index.php/Kapten_Haddocks_samlade_svordomar) that solves the hard problem of scheduling under constraints using the fantastic [Scala 3](https://scala-lang.org/) with [Scala JS](https://www.scala-js.org/doc/tutorial/basic/). It is built using [`sbt`](https://www.scala-sbt.org/).

# How to bump Scala version
When changing Scala version you need to edit all these:
* `build.sbt` after scalaVersion
* `publish.sh` in path of target
* `index-dev.html` in path in script tag 

# How to build and run

`sbt fastLinkJS` 

Open `index-dev.html` in your browser with File->Open.

# How to publish

Can only be done with owner of the right credentials to fileadmin@cs: `sh publish.sh`

There are no releases in this repo; we run on bleeding-edge master branch.

When publishing using `publish.sh` this [script](https://github.com/bjornregnell/kapten-alloc-web/blob/master/bump-version.sc) changes the version for JavaScript file main.js in src attribute of script tag in index.html.

Example: 

Version change from 
```html
    <script type="text/javascript" src="https://fileadmin.cs.lth.se/pgk/kaptenalloc/main.js?version=1"></script>
```
to 
```html
    <script type="text/javascript" src="https://fileadmin.cs.lth.se/pgk/kaptenalloc/main.js?version=2"></script>
```

Before running publish.sh check that everything looks ok.
