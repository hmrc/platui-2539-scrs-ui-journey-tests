package uk.gov.hmrc.test.ui.pages.payeRegistration

import uk.gov.hmrc.configuration.TestEnvironment
import uk.gov.hmrc.test.ui.pages.BasePage.clickById

object HireSubcontractors {
  val url: String = s"${TestEnvironment.url("paye-registration-frontend")}/hire-subcontractors"
  val nextButton: String = "continue"

  def employsSubcontractors() = clickById("employsSubcontractors")
}
