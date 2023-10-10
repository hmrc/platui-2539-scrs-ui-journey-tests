package uk.gov.hmrc.test.ui.pages.payeRegistration

import uk.gov.hmrc.configuration.TestEnvironment

object CheckAndConfirmYourAnswersPAYE {
  val url: String = s"${TestEnvironment.url("paye-registration-frontend")}/check-and-confirm-your-answers"
  val nextButton: String = "continue"
}
