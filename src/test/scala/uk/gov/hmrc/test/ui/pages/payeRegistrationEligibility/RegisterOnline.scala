package uk.gov.hmrc.test.ui.pages.payeRegistrationEligibility

import uk.gov.hmrc.configuration.TestEnvironment

object RegisterOnline {
  val url: String = s"${TestEnvironment.url("paye-registration-eligibility-frontend")}/register-online"
  val nextButton: String = "continue"
}
