package uk.gov.hmrc.test.ui.pages.payeRegistration

import uk.gov.hmrc.configuration.TestEnvironment

object WhereToSendPost {
  val url: String = s"${TestEnvironment.url("paye-registration-frontend")}/where-to-send-post"
  val nextButton: String = "continue"
}