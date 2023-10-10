package uk.gov.hmrc.test.ui.pages.companyRegistration

import uk.gov.hmrc.configuration.TestEnvironment

object ApplicationSubmittedCT {

  val url: String = s"${TestEnvironment.url("company-registration-frontend")}/application-submitted"
  val nextButton: String = "continue"

}
