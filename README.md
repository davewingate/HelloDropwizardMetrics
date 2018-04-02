# HelloDropwizardMetrics
A 'hello world' demonstration of the Dropwizard Metrics library.
It's a Dropwizard app that offers a [GreeterResource](src/main/java/hello/metrics/resources/GreeterResource.java), which let's us try out various metrics.

Building and Running
---
1. Run `mvn clean install` to build your application
1. Start application with `java -jar target/metrics-1.0.jar server config.yml`
1. To check that your application is running, browse to
  - The admin url:  `http://local.sdxdemo.com:8081/`
  - A demo app url: `http://local.sdxdemo.com:8080/greeting`

What is Dropwizard?
---
 - An opinionated framework for building RESTful web services in Java.
 - Glues together third-party libraries: Jetty to serve HTTP requests; Jersey for modeling REST resources; Jackson for marshaling JSON.
 - Also includes a the "Dropwizard Metrics" module, which is our focus today.

What is [Dropwizard](http://www.dropwizard.io/1.3.0/docs/getting-started.html)?
---
 - An opinionated framework for building RESTful web services in Java.
 - Glues together third-party libraries: Jetty to serve HTTP requests; Jersey for modeling REST resources; Jackson for marshaling JSON.
 - Also includes a the "Dropwizard Metrics" module, which is our focus today.

What is [Dropwizard Metrics](http://metrics.dropwizard.io/4.0.0/)?
---
 - A Java framework for _capturing_ and _publishing_ JVM and application metrics.
 - Originally developed for Yammer, and now popularized as part of Dropwizard.
 - __Could__ be used [independently](http://metrics.dropwizard.io/4.0.0/getting-started.html) of a Dropwizard web application.
 - But here we'll practice using the metrics library as part of a Dropwizard web application.

Discussion and Lab Exercises
---
 - Find the [GreeterResource](src/main/java/hello/metrics/resources/GreeterResource.java).  What endpoints does it offer?
   - [/greeting](http://localhost:8080/greeting)
   - [/greeting/timed-demo](http://localhost:8080/greeting/timed-demo)
   - [/greeting/gauge-demo](http://localhost:8080/greeting/gauge-demo)
 - What type of metric does each endpoint measure?
 - Where can we [view the observed metric values](http://local.sdxdemo.com:8081/metrics?pretty=true)?
 - What other [types of metrics](http://metrics.dropwizard.io/4.0.0/manual/core.html) does Dropwizard metrics support?
 - We've seen examples of Timers and Gauges in action.  Demonstrate the use of some other supported metric type by adding a new endpoint to [GreeterResource](src/main/java/hello/metrics/resources/GreeterResource.java).

