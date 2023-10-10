package uk.gov.hmrc.test.ui.pages.companyRegistration

import uk.gov.hmrc.configuration.TestEnvironment

object ContactAboutCT {

  val url: String = s"${TestEnvironment.url("company-registration-frontend")}/contact-about-corporation-tax"
  val nextButton: String = "continue"

}
