package uk.gov.hmrc.test.ui.pages.companyRegistration

import uk.gov.hmrc.configuration.TestEnvironment

object FeatureSwitchCRFE {
  val url: String = s"${TestEnvironment.url("company-registration-frontend")}/test-only/feature-switch"
  val nextButton: String = "continue"
}
