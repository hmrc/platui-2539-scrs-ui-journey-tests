/*
 * Copyright 2018 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.pages

import org.openqa.selenium.support.ui.Select
import uk.gov.hmrc.configuration.TestEnvironment
import uk.gov.hmrc.test.ui.pages.companyRegistrationEligibility.SettingUpNewLimitedCompany

object AuthLoginStub extends BasePage {

  val url: String = TestEnvironment.url("auth-login-stub") + "/gg-sign-in"
  override val title: String = ""

  def Submit() = findByCSS("input[value=Submit]").click()


  def login() = {
    deletecookies()
    navigateTo(url)
    waitForPageToBeLoaded(findByName("redirectionUrl").size() > 0, "Failed to load auth wizard")
    sendKeysByName("redirectionUrl", 0, SettingUpNewLimitedCompany.url)
    val dropdown: Select = new Select(findByName("affinityGroup").get(0))
    dropdown.selectByVisibleText("Organisation")

    val dropdown1: Select = new Select(findByName("additionalInfo.emailVerified").get(0))
    dropdown1.selectByVisibleText("True")
    Submit()
  }

}

