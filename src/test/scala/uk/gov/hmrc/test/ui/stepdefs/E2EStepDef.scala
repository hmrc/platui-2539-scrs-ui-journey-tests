package uk.gov.hmrc.test.ui.stepdefs

import io.cucumber.scala.{EN, ScalaDsl}
import uk.gov.hmrc.test.ui.pages.companyRegistration._
import uk.gov.hmrc.test.ui.pages.companyRegistrationEligibility._
import uk.gov.hmrc.test.ui.pages.payeRegistration._
import uk.gov.hmrc.test.ui.pages.{AuthLoginStub, BasePage}

class E2EStepDef extends ScalaDsl with EN {


  Then("""^The user wants to set up a new limited company$""") { () =>
    SettingUpNewLimitedCompany.navigateTo(SettingUpNewLimitedCompany.url)

  }

  Then("""^The user chooses to start a new application$""") { () =>
    SettingUpNewLimitedCompany.clickYes()
    BasePage.clickContinue()
  }


  Then("""^The user chooses to continue after seeing the information on the Check Before You Start page$""") { () =>
    CheckBeforeYouStart.navigateTo(CheckBeforeYouStart.url)
    BasePage.clickContinue()
  }

  Then("""^The user is navigated to the card or PayPal page selects yes and continues$""") { () =>
    CardPaypal.clickYes()
    BasePage.clickContinue()
  }

  Then("""^The user is directed to the Companies House Secure Register Form page and confirms they don't have any directors or 'persons with significant control' on the Secure Register$""") { () =>
    SecureRegisterForm.clickNo()
    BasePage.clickContinue()
  }

  Then("""^The user is notified that they have to create a Government Gateway user ID to set up their company$""") { () =>
    SetUpCompany.confirmUrl(SetUpCompany.url)
  }

  Then("""^The user is directed to theRegistrationEmail Government Gateway page to create their user ID$""") { () =>
    AuthLoginStub.navigateToUrl(AuthLoginStub.url)
  }


  // second scenario
  Then("""^The user logs in$""") { () =>
    AuthLoginStub.login()
  }


  Then("""^The user chooses to continue with application$""") { () =>
    SettingUpNewLimitedCompany.clickNo()
    BasePage.clickContinue()
  }


  Then("""^The user chooses a pre-populated email address$""") { () =>
    RegistrationEmail.clickEmail()
    BasePage.clickContinue()
  }

  Then("""^The user selects Company Director as their relationship to the company$""") { () =>
    RelationshipToCompany.completionCapacity()
    BasePage.clickContinue()
  }

  Then("""^The user returns from Company's House after entering the company's name$""") { () =>
    BasePage.clickNext()
  }


  Then("""^The user selects their company's principal place of business address$""") { () =>
    PPOB.addressChoice()
    BasePage.clickContinue()
  }

  Then("""^The user accepts the pre-populated defaults and is navigated to the Replacing Another Business Page$""") { () =>
    BasePage.clickContinue()
  }


  Then("""^The user confirms their company is not taking over another business$""") { () =>
    ReplacingAnotherBusiness.replacingAnotherBusiness()
    BasePage.clickContinue()
  }

  Then("""^The user is asked about when their company will start trading$""") { () =>
    WhenStartBusiness.businessStartDate()
    BasePage.clickContinue()
  }

  Then("""^The user confirms that the company may pay interest on a non-bank loan, make royalty payments or receive interest$""") { () =>
    LoanPaymentsDividends.regularPayments()
    BasePage.clickContinue()
  }

  Then("""^The user returns from Company's House and has entered a Corporate Shareholder$""") { () =>
    SecondCoHoStubHO3andHO4.next3_1()
  }


  Then("""^The user says the new company will be in the same group for group relief$""") { () =>
    GroupRelief.groupRelief()
    BasePage.clickContinue()
  }

  Then("""^The user selects the name of the pre-popped Corporate Shareholder$""") { () =>
    OwningCompanyName.groupName()
    BasePage.clickContinue()
  }

  Then("""^The user selects the pre-formatted address for the Owning Company$""") { () =>
    OwningCompanysAddress.groupAddress()
    BasePage.clickContinue()
  }

  Then("""^The user enters the Owning Company's UTR$""") { () =>
    OwningCompanysUtr.groupUTR()
    BasePage.clickById("utr")
    BasePage.sendKeysById("utr", "12345678")
    BasePage.clickContinue()
  }


  Then("""^The user returns from Companies House after entering their Persons of Significant Control$""") { () =>
    BasePage.clickNext()
  }


  Then("""^The user checks the information they have entered on the HMRC summary page and confirms it is correct$""") { () =>
    BasePage.clickContinue()
  }

  Then("""^The user checks the information they have entered on the Companies House summary page$""") { () =>
    BasePage.clickNext()
  }

  Then("""^The user has viewed their payment information and accepted it$""") { () =>
    BasePage.clickNext()
  }

  Then("""^The user is presented with an acknowledgement that their application has been successfully submitted$""") { () =>
    BasePage.clickContinue()
  }

  Then("""^The user sees an overview of their application details on the SCRS Dashboard and chooses to register for PAYE$""") { () =>
    BasePage.linkText()
  }


  Then("""^The user has passed the PAYE eligibility questions$""") { () =>
    WillEmployAnyone.navigateToUrl(WillEmployAnyone.url)
  }


  Then("""^The user is on the page that asks if the company will pay anyone over the minimum PAYE thresholds and answers no$""") { () =>
    WillEmployAnyone.willBePaying()
    BasePage.clickContinue()
  }


  Then("""^The user is asked if the company is in the Construction Industry and answers yes$""") { () =>
    WorkConstructionIndustry.inConstructionIndustry()
    BasePage.clickContinue()
  }

  Then("""^The user is asked if any sub-contractors will be hired in the current tax year and answers yes$""") { () =>
    HireSubcontractors.employsSubcontractors()
    BasePage.clickContinue()
  }

  Then("""^The user is asked what is their relationship to the company and selects director$""") { () =>
    RelationshipToCompanyPAYE.completionCapacity()
    BasePage.clickContinue()
  }

  Then("""^The user is asked if the company will trade under a different name and changes the trading name to Different Ltd$""") { () =>
    TradingName.differentName()
    BasePage.clickById("tradingName")
    BasePage.sendKeysById("tradingName", "Different Ltd")
    BasePage.clickContinue()
  }

  Then("""^The user is asked to confirm the company's registered office address$""") { () =>
    BasePage.clickContinue()
  }

  Then("""^The user is asked where the company's principle place of business is$""") { () =>
    WhereCompanyCarriesOutBusinessActivities.chosenAddress()
    BasePage.clickContinue()
  }

  Then("""^The user is asked for the company's contact details and accepts the pre-popped values$""") { () =>
    BasePage.clickContinue()
  }

  Then("""^The user is asked to provide a description of what the company does$""") { () =>
    BasePage.clickById("description")
    BasePage.sendKeysById("description", "Makes toys")
    BasePage.clickContinue()
  }

  Then("""^The user is asked to provide the NINO of at least one director$""") { () =>
    BasePage.clickById("nino[0]")
    BasePage.sendKeysById("nino[0]", "SR223344C")
    BasePage.clickById("nino[1]")
    BasePage.sendKeysById("nino[1]", "SR223345C")
    BasePage.clickContinue()
  }


  Then("""^The user enters their name but leaves everything else as pre-popped when providing contact details$"""){ () =>
    BasePage.clickById("name")
    BasePage.sendKeysById("name", "The Tester")
    BasePage.clickContinue()
  }

  Then("""^The user chooses for the post to be sent to the Register Office address$"""){ () =>
    BasePage.clickById("chosenAddress")
    BasePage.clickContinue()
  }

  Then("""^The user is asked to review all the answers they have entered and confirms all is correct$"""){ () =>
    BasePage.clickContinue()
  }


  Then("""^The user is successful and finishes the PAYE registration process and return back to the SCRS dashboard$"""){ () =>
    BasePage.clickContinue()
  }

}
