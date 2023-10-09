package uk.gov.hmrc.test.ui.pages.companyRegistrationEligibility

import uk.gov.hmrc.test.ui.pages.BasePage

object CheckBeforeYouStart extends BasePage {
  val url: String = s"${TestEnvironment.url("company-registration-eligibility-frontend")}/check-before-you-start"
  val continueButton: String = "continue"
  val title: String = ""
}
