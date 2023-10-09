package uk.gov.hmrc.test.ui.pages.payeRegistration

import uk.gov.hmrc.test.ui.pages.BasePage.clickById

object WorkConstructionIndustry {
  val url: String = s"${TestEnvironment.url("paye-registration-frontend")}/work-construction-industry"
  val nextButton: String = "continue"

  def inConstructionIndustry() = clickById("inConstructionIndustry")
}
