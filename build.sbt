enablePlugins(ScalaJSPlugin)

name := "kaptenalloc-web"
scalaVersion := "3.5.0"

// This is an application with a main method
scalaJSUseMainModuleInitializer := true

libraryDependencies += ("org.scala-js" %%% "scalajs-dom" % "2.8.0")
libraryDependencies += "io.github.cquiroz" %%% "scala-java-time" % "2.6.0"
libraryDependencies += "io.github.cquiroz" %%% "scala-java-time-tzdb" % "2.6.0"
