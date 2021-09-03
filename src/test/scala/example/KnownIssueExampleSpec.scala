package example

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import uk.gov.hmrc.scalatestaccessibilitylinter.AccessibilityMatchers

class KnownIssueExampleSpec extends AnyFlatSpec with Matchers with AccessibilityMatchers {
  def htmlPage(body: String): String =
    s"""<!DOCTYPE html>
      |<html lang="en">
      |<head><title>test</title></head>
      |<body>
      |<main>
      |<h1>Test</h1>
      |$body
      |</main>
      |</body>
      |</html>""".stripMargin 
  
  "Example input component" should "pass accessibility checks" in {
    // this known vnu issue is not always treated as a known issue:
    //
    //    htmlPage("""<input type="hidden" readonly>""") should passAccessibilityChecks
    //
    // this is because the html hasn't actually been rendered in a browser if it had been
    // and we had captured the outerHtml of DOM then the snapshot we'd get after would be:
    // 
    //    <input type="hidden" readonly="">     and match the known issue regex
    //
    htmlPage("""<input type="hidden" readonly="">""") should passAccessibilityChecks
  }
}
