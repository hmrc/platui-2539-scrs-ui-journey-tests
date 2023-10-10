#!/bin/bash -e

BROWSER=$1
ENVIRONMENT=$2

sbt -Dbrowser="${BROWSER:=chrome}" -Denvironment="${ENVIRONMENT:=local}" -Dsecurity.assessment=true "testOnly uk.gov.hmrc.test.ui.utils.Runner" testReport