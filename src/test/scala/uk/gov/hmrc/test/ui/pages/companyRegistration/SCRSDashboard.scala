package uk.gov.hmrc.test.ui.pages.companyRegistration

import uk.gov.hmrc.configuration.TestEnvironment

object SCRSDashboard {

  val url: String = s"${TestEnvironment.url("company-registration-frontend")}/company-registration-overview"
  val signOut: String = "signOut"

}
