scala run bump-version.sc
sbt "clean;fastLinkJS"
scp target/js/main.js $LUCATID@fileadmin.cs.lth.se:pgk/kaptenalloc/.
scp index.html $LUCATID@fileadmin.cs.lth.se:pgk/kaptenalloc/.
