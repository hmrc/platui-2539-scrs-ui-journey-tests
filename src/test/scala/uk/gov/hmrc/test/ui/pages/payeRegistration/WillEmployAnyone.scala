package uk.gov.hmrc.test.ui.pages.payeRegistration

import uk.gov.hmrc.test.ui.pages.BasePage

object WillEmployAnyone extends BasePage{
  val url: String = s"${TestEnvironment.url("paye-registration-frontend")}/will-employ-anyone"
  val nextButton: String = "continue"
  val title: String = ""

  def willBePaying() = clickById("willBePaying-no")

}
