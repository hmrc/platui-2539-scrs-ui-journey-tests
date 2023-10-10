package uk.gov.hmrc.test.ui.pages.companyRegistration

import uk.gov.hmrc.configuration.TestEnvironment
import uk.gov.hmrc.test.ui.pages.BasePage.clickById

object OwningCompanyName {
  val url: String = s"${TestEnvironment.url("company-registration-frontend")}/owning-companys-name"
  val nextButton: String = "continue"

  def groupName() = clickById("groupName-0")
}
