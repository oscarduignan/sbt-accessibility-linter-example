import sbt._

object Dependencies {
  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.2.8"
  // the linter would normally only be added by the plugin, but because this is a SNAPSHOT I'm explicitly
  // adding it as a dependency so that the version added by the plugin is replaced to save anyone testing
  // from having to publishLocal the linter AND the plugin, where the plugin just has a version bump.
  lazy val scalaTestAccessibilityLinter = "uk.gov.hmrc" %% "scalatest-accessibility-linter" % "0.4.0-SNAPSHOT"
}
