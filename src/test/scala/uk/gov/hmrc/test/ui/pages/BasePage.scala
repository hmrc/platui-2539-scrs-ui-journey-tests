package uk.gov.hmrc.test.ui.pages

import org.openqa.selenium.By
import org.scalatest.matchers.should.Matchers
import uk.gov.hmrc.test.ui.driver.BrowserDriver

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
