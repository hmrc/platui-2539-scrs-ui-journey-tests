package uk.gov.hmrc.test.ui.pages.payeRegistration

import uk.gov.hmrc.configuration.TestEnvironment

object BusinessContactDetails {
  val url: String = s"${TestEnvironment.url("paye-registration-frontend")}/business-contact-details"
  val nextButton: String = "continue"
}
