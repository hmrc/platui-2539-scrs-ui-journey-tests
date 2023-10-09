package uk.gov.hmrc.test.ui.pages.companyRegistration

import uk.gov.hmrc.test.ui.pages.BasePage

object LoanPaymentsDividends extends BasePage {
  val url: String = s"${TestEnvironment.url("company-registration-frontend")}/loan-payments-dividends"
  val nextButton: String = "continue"
  val title: String = ""


  def regularPayments() = clickById("regularPayments")

}