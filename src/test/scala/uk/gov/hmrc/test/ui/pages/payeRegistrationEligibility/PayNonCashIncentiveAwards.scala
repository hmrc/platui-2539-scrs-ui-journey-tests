package uk.gov.hmrc.test.ui.pages.payeRegistrationEligibility

import uk.gov.hmrc.configuration.TestEnvironment

object PayNonCashIncentiveAwards {
  val url: String = s"${TestEnvironment.url("paye-registration-eligibility-frontend")}/pay-non-cash-incentive-awards"
  val nextButton: String = "continue"
}
