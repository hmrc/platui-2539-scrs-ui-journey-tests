package uk.gov.hmrc.test.ui.pages.companyRegistration

import uk.gov.hmrc.test.ui.pages.BasePage

object RegistrationEmail extends BasePage {

  val url: String = s"${TestEnvironment.url("company-registration-frontend")}/registration-email"
  val nextButton: String = "continue"
  val title: String = ""

  def clickYes() = clickById("returningUser")
  def clickNo() = clickById("returningUser-no")
  def clickEmail() = clickById("registrationEmail")

}
