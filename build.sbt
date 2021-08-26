import Dependencies._

ThisBuild / scalaVersion     := "2.12.13"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "platui-1173",
    libraryDependencies += scalaTest % Test,
    Test / parallelExecution := false,
    Test / testOptions ++= Seq(
      Tests.Argument("-o"), // default stdout reporter
      Tests.Argument("-C", "uk.gov.hmrc.scalatestaccessibilitylinter.reporters.ConsoleSummaryReporter")
    )
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
