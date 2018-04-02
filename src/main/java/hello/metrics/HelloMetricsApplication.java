package hello.metrics;

import hello.metrics.resources.GreeterResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class HelloMetricsApplication extends Application<HelloMetricsConfiguration> {

    public static void main(final String[] args) throws Exception {
        new HelloMetricsApplication().run(args);
    }

    @Override
    public String getName() {
        return "HelloMetrics";
    }

    @Override
    public void initialize(final Bootstrap<HelloMetricsConfiguration> bootstrap) {
    }

    @Override
    public void run(final HelloMetricsConfiguration configuration,
                    final Environment environment) {
        environment.jersey().register(new GreeterResource(environment.metrics()));
    }

}
