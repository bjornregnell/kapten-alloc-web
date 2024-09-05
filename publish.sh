VER=3.5.0
scala run bump-version.sc
sbt "clean;fastLinkJS"
scp target/scala-$VER/kaptenalloc-web-fastopt/main.js $LUCATID@fileadmin.cs.lth.se:pgk/kaptenalloc/.
scp index.html $LUCATID@fileadmin.cs.lth.se:pgk/kaptenalloc/.
