val scala3Version = "3.7.4"

lazy val root = project
  .in(file("."))
  .settings(
    name := "Egyptian Rat Screw",
    version := "0.1.0",

    scalaVersion := scala3Version,

    libraryDependencies += "org.scalameta" %% "munit" % "1.0.0" % Test,
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.19" % "test"

  )