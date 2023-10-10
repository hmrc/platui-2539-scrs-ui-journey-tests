package uk.gov.hmrc.test.ui.pages.companyRegistrationEligibility

import uk.gov.hmrc.configuration.TestEnvironment

object TakingOverBusiness {
  val url: String = s"${TestEnvironment.url("company-registration-eligibility-frontend")}/taking-over-business"
  val continueButton: String = "continue"
}
