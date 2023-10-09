package uk.gov.hmrc.test.ui.utils

import io.cucumber.junit.{Cucumber, CucumberOptions}
import org.junit.runner.RunWith

@RunWith(classOf[Cucumber])
@CucumberOptions(
  features = Array("src/test/scala/features"),
  glue = Array("uk.gov.hmrc.test.ui.stepdefs"),
  plugin = Array("pretty", "html:target/cucumber.html", "json:target/cucumber.json", "junit:target/test-reports/Runner.xml"),
  tags = "@scrs"

)
class Runner {
}