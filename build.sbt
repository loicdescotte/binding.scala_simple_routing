enablePlugins(ScalaJSPlugin)

name := "Binding.scala hamsters js test"
scalaVersion := "2.12.3"
addCompilerPlugin("org.scalameta" % "paradise" % "3.0.0-M10" cross CrossVersion.full)
libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.2"
libraryDependencies += "org.scala-lang.modules" %% "scala-xml" % "1.0.5"
libraryDependencies += "com.thoughtworks.binding" %%% "dom" % "10.0.1"
libraryDependencies += "com.thoughtworks.binding" %%% "route" % "10.0.1"
libraryDependencies += "io.github.scala-hamsters" %%% "hamsters" % "2.2.0"
libraryDependencies += "org.scalameta" %% "scalameta" % "1.8.0" % Provided
//scalaCompilerBridgeSource := ("org.scala-sbt" % "compiler-interface" % "1.0.4" % "component").sources

// This is an application with a main method
scalaJSUseMainModuleInitializer := true
