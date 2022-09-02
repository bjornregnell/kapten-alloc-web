scala-cli bump-version.sc
sbt fastLinkJS
scp target/scala-3.1.3/kaptenalloc-web-fastopt/main.js $LUCATID@fileadmin.cs.lth.se:pgk/kaptenalloc/.
scp index.html $LUCATID@fileadmin.cs.lth.se:pgk/kaptenalloc/.
