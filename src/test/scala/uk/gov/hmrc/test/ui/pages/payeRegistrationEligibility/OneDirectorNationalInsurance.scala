package uk.gov.hmrc.test.ui.pages.payeRegistrationEligibility

import uk.gov.hmrc.test.ui.pages.BasePage

object  OneDirectorNationalInsurance extends BasePage {
  val url: String = s"${TestEnvironment.url("paye-registration-eligibility-frontend")}/one-director-national-insurance"
  val nextButton: String = "continue"
  val title: String = ""
}
