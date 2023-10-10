package uk.gov.hmrc.test.ui.pages.companyRegistration

import uk.gov.hmrc.configuration.TestEnvironment
import uk.gov.hmrc.test.ui.pages.BasePage

object ReplacingAnotherBusiness extends BasePage {

  val url: String = s"${TestEnvironment.url("company-registration-frontend")}/replacing-another-business"
  val nextButton: String = "continue"
  val title: String = ""

  def replacingAnotherBusiness() = clickById("replacingAnotherBusiness-no")

}
