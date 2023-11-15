name := "platui-2539-scrs-ui-journey-tests"

version := "0.1.0"

scalaVersion := "2.13.10"

scalacOptions ++= Seq("-unchecked", "-deprecation")

resolvers += "HMRC-open-artefacts-maven" at "https://open.artefacts.tax.service.gov.uk/maven2"
resolvers += "hmrc-releases" at "https://artefacts.tax.service.gov.uk/artifactory/hmrc-releases/"
resolvers += Resolver.url("HMRC-open-artefacts-ivy", url("https://open.artefacts.tax.service.gov.uk/ivy2"))(Resolver.ivyStylePatterns)

testOptions in Test += Tests.Argument(TestFrameworks.ScalaTest, "-h", "target/test-reports/html-report")
testOptions in Test += Tests.Argument("-o")

libraryDependencies ++= Seq(
  "uk.gov.hmrc" %% "ui-test-runner" % "0.+" % "test", // Do NOT use .+ notation in test repositories
  "org.scalatest" %% "scalatest" % "3.2.17" % "test",
  "org.scalatestplus"   %% "selenium-4-12"     % "3.2.17.0" % Test,
  "org.pegdown" % "pegdown" % "1.6.0" % "test",
  "com.typesafe" % "config" % "1.4.2",
  "io.cucumber" %% "cucumber-scala" % "8.14.2" % "test",
  "io.cucumber" % "cucumber-java" % "7.11.2" % "test",
  "io.cucumber" % "cucumber-junit" % "7.11.2" % "test",
  "io.cucumber" % "cucumber-picocontainer" % "7.11.2" % "test",
  "junit" % "junit" % "4.13.2" % "test",
  "com.novocode" % "junit-interface" % "0.11" % "test",
  "log4j" % "log4j" % "1.2.17"
)
