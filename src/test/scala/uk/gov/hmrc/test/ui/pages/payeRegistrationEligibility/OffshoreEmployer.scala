package uk.gov.hmrc.test.ui.pages.payeRegistrationEligibility

import uk.gov.hmrc.configuration.TestEnvironment

object  OffshoreEmployer {
  val url: String = s"${TestEnvironment.url("paye-registration-eligibility-frontend")}/offshore-employer"
  val nextButton: String = "continue"
}
