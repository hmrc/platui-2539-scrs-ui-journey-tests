package uk.gov.hmrc.test.ui.pages.payeRegistration

import uk.gov.hmrc.configuration.TestEnvironment

object ApplicationSubmittedPAYE {
  val url: String = s"${TestEnvironment.url("paye-registration-frontend")}/application-submitted"
  val nextButton: String = "continue"
}