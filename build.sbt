enablePlugins(ScalaJSPlugin)

name := "kaptenalloc-web"
scalaVersion := "3.5.0" // or any other Scala version >= 2.11.12

// This is an application with a main method
scalaJSUseMainModuleInitializer := true

libraryDependencies += ("org.scala-js" %%% "scalajs-dom" % "2.0.0")//.cross(CrossVersion.for3Use2_13)
libraryDependencies += "io.github.cquiroz" %%% "scala-java-time" % "2.3.0"
libraryDependencies += "io.github.cquiroz" %%% "scala-java-time-tzdb" % "2.3.0"
