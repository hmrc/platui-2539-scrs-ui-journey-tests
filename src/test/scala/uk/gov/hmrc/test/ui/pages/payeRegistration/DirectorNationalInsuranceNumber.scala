package uk.gov.hmrc.test.ui.pages.payeRegistration

import uk.gov.hmrc.configuration.TestEnvironment

object DirectorNationalInsuranceNumber {
  val url: String = s"${TestEnvironment.url("paye-registration-frontend")}/director-national-insurance-number"
  val nextButton: String = "continue"
}