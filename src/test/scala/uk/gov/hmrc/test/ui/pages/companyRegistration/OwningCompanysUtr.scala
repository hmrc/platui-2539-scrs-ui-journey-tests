package uk.gov.hmrc.test.ui.pages.companyRegistration

import uk.gov.hmrc.test.ui.pages.BasePage.clickById

object OwningCompanysUtr {
  val url: String = s"${TestEnvironment.url("company-registration-frontend")}/owning-companys-utr"
  val nextButton: String = "continue"

  def groupUTR() = clickById("groupUTR")

}
