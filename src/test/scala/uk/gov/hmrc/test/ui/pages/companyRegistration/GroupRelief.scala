package uk.gov.hmrc.test.ui.pages.companyRegistration

import uk.gov.hmrc.test.ui.pages.BasePage.clickById

object GroupRelief {
  val url: String = s"${TestEnvironment.url("company-registration-frontend")}/group-relief"
  val nextButton: String = "continue"

  def groupRelief() = clickById("groupRelief")
}
