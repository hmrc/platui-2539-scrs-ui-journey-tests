package uk.gov.hmrc.test.ui.pages.companyRegistrationEligibility

import uk.gov.hmrc.configuration.TestEnvironment

object FeatureSwitchCREFE {
  val url: String = s"${TestEnvironment.url("company-registration-eligibility-frontend")}/test-only/feature-switch"
  val nextButton: String = "continue"
}
