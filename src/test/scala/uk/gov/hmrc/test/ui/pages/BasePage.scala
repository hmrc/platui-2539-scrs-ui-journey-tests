package uk.gov.hmrc.test.ui.pages

import org.openqa.selenium.support.ui.{ExpectedConditions, FluentWait}
import org.openqa.selenium.{By, WebDriver}
import org.scalatest.matchers.must.Matchers
import org.scalatestplus.selenium.Page

import java.time.Duration
import java.time.temporal.ChronoUnit
import scala.util.Random

object BasePage extends BasePage {
  val url = ""
  val title = "No title provided"
}

trait BasePage extends Matchers with Page {
  val driver = Driver.instance
  val UNKNOWN = "Unknown property"

  val url: String
  val title: String

  def navTo() = navigateTo(s"$basePageUrl/$url")

  lazy val basePageUrl: String = {
    val environmentProperty = System.getProperty("environment", "local").toLowerCase
    environmentProperty match {
      case "local" => "http://localhost:9970/register-your-company"
      case "qa" => "https://www.qa.tax.service.gov.uk/register-your-company"
      case _ => throw new IllegalArgumentException(s"Environment '$environmentProperty' not known")
    }
  }

  lazy val registerYourBusinessBasePageUrl: String = {
    val environmentProperty = System.getProperty("environment", "local").toLowerCase
    environmentProperty match {
      case "local" => "http://localhost:9634/register-your-business"
      case "qa" => "https://www.qa.tax.service.gov.uk/register-your-business"
      case _ => throw new IllegalArgumentException(s"Environment '$environmentProperty' not known")
    }
  }

  lazy val iiBaseUrl: String = {
    val environmentProperty = System.getProperty("environment", "local").toLowerCase
    environmentProperty match {
      case "local" => "http://localhost:9976/incorporation-information"
      case "qa" => "https://www.qa.tax.service.gov.uk/incorporation-information"
      case _ => throw new IllegalArgumentException(s"Environment '$environmentProperty' not known")
    }
  }


  def waitForPageToBeLoaded(condition: => Boolean, exceptionMessage: String, timeoutInSeconds: Int = 30) : Unit = {
    val endTime = System.currentTimeMillis + timeoutInSeconds * 1000
    while (System.currentTimeMillis < endTime) {
      try {
        if (condition) return
      } catch {
        case _: RuntimeException => ()
      }
      Thread.sleep(500)
    }
    throw new Exception(exceptionMessage + "\n<PAGE LOAD TIMEOUT> The current page was: " + driver.getCurrentUrl + " with title " + driver.getTitle)
  }

  def secondsWait(secs: Int) = Thread.sleep(secs.*(1000))

  def deletecookies() = driver.manage().deleteAllCookies()

  private val randomCred = (new Random()).nextInt(1000000000)

  // Page Helpers

  def incorpId: Boolean = findById("incorpID").isDisplayed

  def navigateTo(url: String) = driver.navigate().to(url)

  def findById(id: String) = driver.findElement(By.id(id))

  def findByCSS(cssClass: String) = driver.findElement(By.cssSelector(cssClass))

  def findAllByCSS(htmlClass: String) = driver.findElements(By.cssSelector(htmlClass))

  def findByName(id: String) = driver.findElements(By.name(id))

  def clickById(id: String) = findById(id).click()

  def clickByName(id: String, num: Int) = findByName(id).get(num).click()

  def sendKeysById(id: String, value: String) = {
    findById(id).clear()
    findById(id).sendKeys(value)
  }

  def sendKeysByName(id: String, index: Int, value: String) = {
    findByName(id).clear()
    findByName(id).get(index).sendKeys(value)
  }

  //Navigation through pages
  def clickNext() = findById("next").click()

  def clickContinue() = findById("continue").click()

  def clickSubmit() = findById("submit").click()


  val WAIT_POLLING_INTERVAL: Duration = Duration.of(250, ChronoUnit.MILLIS)
  val WAIT_TIME_OUT: Duration = Duration.of(20, ChronoUnit.SECONDS)

  val fluentWait: FluentWait[WebDriver] =
    new FluentWait[WebDriver](BasePage.driver)
      .withTimeout(WAIT_TIME_OUT)
      .pollingEvery(WAIT_POLLING_INTERVAL)

  def confirmUrl(url: String): Unit = {
    fluentWait.until(ExpectedConditions.urlContains(url))
    val currentUrl = driver.getCurrentUrl
    assert(currentUrl.contains(url) || url.contains(currentUrl), s"Expected url is: $url. Actual url is: $currentUrl")
  }


  def navigateToUrl(url: String): Unit = {
    driver.get(url)
    fluentWait.until(ExpectedConditions.urlToBe(url))
  }

  def linkText() = clickById("payeStatusText")


}
