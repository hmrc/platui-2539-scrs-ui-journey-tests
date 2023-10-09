package uk.gov.hmrc.test.ui.pages.companyRegistrationEligibility

import uk.gov.hmrc.test.ui.pages.BasePage

object SettingUpNewLimitedCompany extends BasePage {

  val url: String = s"${TestEnvironment.url("company-registration-frontend")}/setting-up-new-limited-company"
  val nextButton: String = "continue"
  val title: String = ""

  def clickYes() = clickById("returningUser")
  def clickNo() = clickById("returningUser-no")

}
