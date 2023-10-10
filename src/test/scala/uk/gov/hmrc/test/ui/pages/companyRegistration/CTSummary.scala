package uk.gov.hmrc.test.ui.pages.companyRegistration

import uk.gov.hmrc.configuration.TestEnvironment

object CTSummary {

  val url: String = s"${TestEnvironment.url("company-registration-frontend")}/check-confirm-answers"
  val nextButton: String = "continue"
}
