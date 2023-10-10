package uk.gov.hmrc.test.ui.pages.companyRegistration

import uk.gov.hmrc.configuration.TestEnvironment

object FirstCoHoStub {

  val url: String = s"${TestEnvironment.url("incorporation-frontend-stubs")}/basic-company-details"
  val nextButton: String = "next"


}
