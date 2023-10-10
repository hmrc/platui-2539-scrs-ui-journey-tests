package uk.gov.hmrc.test.ui.pages.payeRegistration

import uk.gov.hmrc.configuration.TestEnvironment

object ConfirmRegisteredOfficeAddress {
  val url: String = s"${TestEnvironment.url("paye-registration-frontend")}/confirm-registered-office-address"
  val nextButton: String = "continue"
}
