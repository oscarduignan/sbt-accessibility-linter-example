# sbt-accessibility-linter-example

This is targeting snapshot dependencies of sbt-accessibility-linter and scalatest-accessibility-linter so you'll need to
compile them and `publishLocal` before you can use this repository.

- https://github.com/hmrc/sbt-accessibility-linter/pull/13
- https://github.com/hmrc/scalatest-accessibility-linter/pull/4

In this repo you need to extract and install the js dependencies of sbt-accessibility-linter before you can run the tests:

```scala
sbt a11yExtract 
sbt a11yInstall
sbt test
```

The tests are located at https://github.com/oscarduignan/sbt-accessibility-linter-example/blob/main/src/test/scala/example/HelloWorldSpec.scala
