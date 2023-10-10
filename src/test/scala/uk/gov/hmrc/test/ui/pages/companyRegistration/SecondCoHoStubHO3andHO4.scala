package uk.gov.hmrc.test.ui.pages.companyRegistration

import uk.gov.hmrc.configuration.TestEnvironment
import uk.gov.hmrc.test.ui.pages.BasePage

object SecondCoHoStubHO3andHO4 extends BasePage {

  val url: String = s"${TestEnvironment.url("incorporation-frontend-stubs")}/business-activities"
  val nextButton: String = "next3_1"
  val title: String = ""

  def next3_1() = clickById("next3_1")

}
