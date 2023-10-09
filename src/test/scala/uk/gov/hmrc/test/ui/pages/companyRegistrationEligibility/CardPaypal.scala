package uk.gov.hmrc.test.ui.pages.companyRegistrationEligibility

import uk.gov.hmrc.test.ui.pages.BasePage

object CardPaypal extends BasePage{
    val url: String = s"${TestEnvironment.url("company-registration-eligibility-frontend")}/card-paypal"
    val continueButton: String = "continue"
    val title: String = ""

    def clickYes() = clickById("value-yes")
    def clickNo() = clickById("value-no")
}
