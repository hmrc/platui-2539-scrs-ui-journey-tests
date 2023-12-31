package uk.gov.hmrc.test.ui.pages.payeRegistration

import uk.gov.hmrc.configuration.TestEnvironment

object WhoShouldWeContact {
  val url: String = s"${TestEnvironment.url("paye-registration-frontend")}/who-should-we-contact"
  val nextButton: String = "continue"
}