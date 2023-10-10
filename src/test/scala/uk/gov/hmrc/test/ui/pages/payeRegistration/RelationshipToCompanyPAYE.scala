package uk.gov.hmrc.test.ui.pages.payeRegistration

import uk.gov.hmrc.configuration.TestEnvironment
import uk.gov.hmrc.test.ui.pages.BasePage.clickById

object RelationshipToCompanyPAYE {
  val url: String = s"${TestEnvironment.url("paye-registration-frontend")}/relationship-to-company"
  val nextButton: String = "continue"

  def completionCapacity() = clickById("completionCapacity")
}
