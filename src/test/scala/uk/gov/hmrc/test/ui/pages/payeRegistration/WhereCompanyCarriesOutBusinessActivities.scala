package uk.gov.hmrc.test.ui.pages.payeRegistration

import uk.gov.hmrc.test.ui.pages.BasePage.clickById

object WhereCompanyCarriesOutBusinessActivities {
  val url: String = s"${TestEnvironment.url("paye-registration-frontend")}/where-company-carries-out-business-activities"
  val nextButton: String = "continue"

  def chosenAddress() = clickById("chosenAddress")
}
