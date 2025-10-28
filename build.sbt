enablePlugins(ScalaJSPlugin)

name := "kaptenalloc-web"
scalaVersion := "3.7.3"

// This is an application with a main method
scalaJSUseMainModuleInitializer := true

Compile / fastLinkJS / scalaJSLinkerOutputDirectory := target.value / "js"

libraryDependencies += ("org.scala-js" %%% "scalajs-dom" % "2.8.0")
libraryDependencies += "io.github.cquiroz" %%% "scala-java-time" % "2.6.0"
libraryDependencies += "io.github.cquiroz" %%% "scala-java-time-tzdb" % "2.6.0"
