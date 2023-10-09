package uk.gov.hmrc.test.ui.stepdefs

import io.cucumber.scala.{EN, ScalaDsl}

object Hooks extends ScalaDsl with EN with Browser {
  BeforeAll {
    startBrowser()
  }

  AfterAll {
    quitBrowser()
  }

}
