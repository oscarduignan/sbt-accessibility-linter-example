package example

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import uk.gov.hmrc.sbtaccessibilitylinter.AccessibilityLintersAndMatchers

class HelloWorldSpec extends AnyFlatSpec with Matchers with AccessibilityLintersAndMatchers {
  def htmlPage(body: String): String =
    s"""<html lang="en">
      |<head><title>test</title></head>
      |<body>
      |<main>
      |<h1>Test</h1>
      |$body
      |</main>
      |</body>
      |</html>""".stripMargin 
  
  "Example input component" should "have no accessibility violations" in {
    htmlPage("""<input type="text" aria-label="something">""") should haveNoAccessibilityViolations
  }
}
