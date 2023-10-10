package uk.gov.hmrc.test.ui.pages.payeRegistration

import uk.gov.hmrc.configuration.TestEnvironment

object WhatCompanyDoes {
  val url: String = s"${TestEnvironment.url("paye-registration-frontend")}/what-company-does"
  val nextButton: String = "continue"
}
