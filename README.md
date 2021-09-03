# sbt-accessibility-linter-example

This is targeting a snapshot dependency of scalatest-accessibility-linter so you'll need to grab that from the PR
below and `publishLocal` before you can use this repository until the new version has been released.

- https://github.com/hmrc/scalatest-accessibility-linter/pull/4

In this repo you need to extract and install the js dependencies of sbt-accessibility-linter before you can run the tests:

```scala
sbt a11yInstall test
```

The tests are located at [/src/test/scala/example/HelloWorldSpec.scala](/src/test/scala/example/HelloWorldSpec.scala)
