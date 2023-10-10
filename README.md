# platui-2539-scrs-ui-journey-tests

UI test suite for the `scrs-ui-journey-tests` to test ui-test-runner and sbt-test-report migration as part of PLATUI-2539.

## Pre-requisites

### Services

Start Mongo Docker container as follows:

```bash
docker run --rm -d -p 27017:27017 --name mongo mongo:4.4
```

Start `scrs-ui-journey-tests` services as follows:

```bash
sm2 --start SCRS_ALL --appendArgs '{"ADDRESS_LOOKUP_FRONTEND": ["-Dmicroservice.hosts.allowList.1=localhost"]}'
```

### Dockerized browser container(s)

Start a browser Docker container as follows:

* Argument `<browser>` must be `remote-chrome`, `remote-edge` or `remote-firefox`.

```bash
./run_browser_with_docker.sh <browser>
```

### Test inspection and debugging

Connect to `127.0.0.1:5900` via a VNC client to inspect and debug test execution.

If prompted for a password the default is `secret`.

## Tests

Run tests as follows:

* Argument `<browser>` must be `chrome`, `edge`, `firefox`, `remote-chrome`, `remote-edge` or `remote-firefox`.
* Argument `<environment>` must be `local`, `dev`, `qa` or `staging`.

```bash
./run_tests.sh <browser> <environment>
```

### Running ZAP tests

ZAP tests can be automated using the HMRC Dynamic Application Security Testing approach. Running
automated ZAP tests should not be considered a substitute for manual exploratory testing using OWASP ZAP.

#### Tagging tests for ZAP

It is not required to proxy every journey test via ZAP. The intention of proxying a test through ZAP is to expose all the
relevant pages of an application to ZAP. So tagging a subset of the journey tests or creating a
single ZAP focused journey test is sufficient.

#### Configuring the browser to proxy via ZAP

Setting the system property `security.assessment=true` configures the browser specified in `browser` property to proxy via ZAP.

## License

This code is open source software licensed under the [Apache 2.0 License]("http://www.apache.org/licenses/LICENSE-2.0.html").