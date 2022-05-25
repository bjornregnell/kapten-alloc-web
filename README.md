# kapten-alloc-web

This single-page client-only web app is available for download and execution in you browser here: https://cs.lth.se/pgk/kaptenalloc

There you can filter the schedule of this course: https://cs.lth.se/pgk

The allocation data was created by the closed source terminal app called [Kapten Alloc](http://www.nissepedia.com/index.php/Kapten_Haddocks_samlade_svordomar) that solves the hard problem of scheduling under constraints using the fantastic [Scala 3](https://scala-lang.org/) with [Scala JS](https://www.scala-js.org/doc/tutorial/basic/). It is built using [`sbt`](https://www.scala-sbt.org/).

# How to bump Scala version
When changing Scala version you need to edit all these:
* `build.sbt` after scalaVersion
* `publish.sh` in path of target
* `index-dev.html` in path in script tag 

# How to build

`sbt fastLinkJS` 

# How to publish
Can only be done with owner of the right credentials to fileadmin@cs: `sh publish.sh`
