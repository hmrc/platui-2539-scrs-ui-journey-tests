package uk.gov.hmrc.test.ui.pages.companyRegistration

import uk.gov.hmrc.configuration.TestEnvironment
import uk.gov.hmrc.test.ui.pages.BasePage

object WhenStartBusiness extends BasePage {
  val url: String = s"${TestEnvironment.url("company-registration-frontend")}/when-start-business"
  val nextButton: String = "continue"
  val title: String = ""


  def businessStartDate() = clickById("businessStartDate")


}
