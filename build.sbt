enablePlugins(ScalaJSPlugin)

name := "Binding.scala routes"
scalaVersion := "2.12.1"

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.1"
libraryDependencies += "org.scala-lang.modules" %% "scala-xml" % "1.0.5"
libraryDependencies += "com.thoughtworks.binding" %%% "dom" % "10.0.1"
libraryDependencies += "com.thoughtworks.binding" %%% "route" % "10.0.1"
libraryDependencies += "io.github.scala-hamsters" %%% "hamstersjs" % "1.4.0"

addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.0" cross CrossVersion.full)

// This is an application with a main method
scalaJSUseMainModuleInitializer := true
