package uk.gov.hmrc.test.ui.stepdefs

import io.cucumber.scala.{EN, ScalaDsl}
import uk.gov.hmrc.selenium.webdriver.Browser

object Hooks extends ScalaDsl with EN with Browser {
  BeforeAll {
    startBrowser()
  }

  AfterAll {
    quitBrowser()
  }

}
