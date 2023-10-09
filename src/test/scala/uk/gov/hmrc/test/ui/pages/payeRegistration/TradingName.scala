package uk.gov.hmrc.test.ui.pages.payeRegistration

import uk.gov.hmrc.test.ui.pages.BasePage.clickById

object TradingName {
  val url: String = s"${TestEnvironment.url("paye-registration-frontend")}/trading-name"
  val nextButton: String = "continue"

  def differentName() = clickById("differentName")
}
