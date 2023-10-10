package uk.gov.hmrc.test.ui.pages.companyRegistration

import uk.gov.hmrc.configuration.TestEnvironment

object FeedbackQuestionnaire {

  val url: String = s"${TestEnvironment.url("company-registration-frontend")}/questionnaire"
  val nextButton: String = "continue"

}
