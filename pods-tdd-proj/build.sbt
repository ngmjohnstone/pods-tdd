ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

lazy val root = (project in file("."))
  .settings(
    name := "pods-tdd-proj"
  )

libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test
libraryDependencies += "org.scalameta" %% "munit-scalacheck" % "0.7.29" % Test
testFrameworks += new TestFramework("munit.Framework")