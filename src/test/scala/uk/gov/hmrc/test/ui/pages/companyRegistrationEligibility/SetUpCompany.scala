package uk.gov.hmrc.test.ui.pages.companyRegistrationEligibility

import uk.gov.hmrc.test.ui.pages.BasePage

object SetUpCompany extends BasePage{

  val url: String = s"${TestEnvironment.url("company-registration-eligibility-frontend")}/set-up-company"
  val createGGIDButton: String = "continue"
  val title: String = ""
}
