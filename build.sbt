enablePlugins(ScalaJSPlugin)

name := "hello Scala.js"
scalaVersion := "3.0.0" // or any other Scala version >= 2.11.12

// This is an application with a main method
scalaJSUseMainModuleInitializer := true

libraryDependencies += ("org.scala-js" %%% "scalajs-dom" % "1.1.0").cross(CrossVersion.for3Use2_13)

