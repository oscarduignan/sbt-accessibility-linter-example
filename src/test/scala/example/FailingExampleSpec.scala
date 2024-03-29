package example

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import uk.gov.hmrc.scalatestaccessibilitylinter.AccessibilityMatchers

class FailingExampleSpec extends AnyFlatSpec with Matchers with AccessibilityMatchers {
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
  
  "Example input component" should "pass accessibility checks" in {
    htmlPage("""<input type="text">""") should passAccessibilityChecks
  }
}
