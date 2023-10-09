package uk.gov.hmrc.test.ui.pages.companyRegistration

import uk.gov.hmrc.test.ui.pages.BasePage

object PPOB extends BasePage {

  val url: String = s"${TestEnvironment.url("company-registration-frontend")}/principal-place-of-business"
  val nextButton: String = "continue"
  override val title: String = ""

  def addressChoice() = clickById("addressChoice")



}
