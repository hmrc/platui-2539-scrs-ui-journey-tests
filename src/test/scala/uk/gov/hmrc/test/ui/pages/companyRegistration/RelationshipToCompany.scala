package uk.gov.hmrc.test.ui.pages.companyRegistration

import uk.gov.hmrc.configuration.TestEnvironment
import uk.gov.hmrc.test.ui.pages.BasePage

object RelationshipToCompany extends BasePage {

  val url: String = s"${TestEnvironment.url("company-registration-frontend")}/relationship-to-company"
  val nextButton: String = "continue"
  val title: String = ""

  def clickYes() = clickById("returningUser")
  def clickNo() = clickById("returningUser-no")
  def completionCapacity() = clickById("completionCapacity")
}
