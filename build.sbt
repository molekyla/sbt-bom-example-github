import com.here.bom.Bom

lazy val scalaCompilerOptions = Seq(
  "-deprecation",
  "-encoding",
  "UTF-8",
  "-feature",
  "-language:existentials",
  "-language:higherKinds",
  "-language:implicitConversions",
  "-unchecked",
  "-Xfatal-warnings",
  "-Xlint",
  "-Yno-adapted-args",
  "-Ywarn-dead-code",
  "-Ywarn-numeric-widen",
  "-Ywarn-value-discard",
  "-Xfuture"
)

lazy val depsOverride = Bom.dependencies("com.fasterxml.jackson" % "jackson-bom" % "2.16.0")
lazy val deps = Bom.read("com.fasterxml.jackson" % "jackson-bom" % "2.16.0")(bom => JacksonDependencies(bom))

lazy val `sbt-bom-example-github` = project
  .in(file("."))
  .settings(depsOverride)
  .settings(deps)
  .settings(
    libraryDependencies += "com.typesafe.play" %% "play" % "2.8.21",
    libraryDependencies ++= deps.key.value.dependencies,
    dependencyOverrides ++= depsOverride.key.value
  )

ThisBuild / scalacOptions ++= scalaCompilerOptions
Global / onChangedBuildSource := ReloadOnSourceChanges

