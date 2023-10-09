package uk.gov.hmrc.test.ui.pages.companyRegistration

import uk.gov.hmrc.test.ui.pages.BasePage.clickById

object OwningCompanysAddress {
  val url: String = s"${TestEnvironment.url("company-registration-frontend")}/owning-companys-address"
  val nextButton: String = "continue"

  def groupAddress() = clickById("groupAddress")

}
