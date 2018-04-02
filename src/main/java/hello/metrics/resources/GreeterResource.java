package hello.metrics.resources;

import com.codahale.metrics.MetricRegistry;
import com.codahale.metrics.annotation.Timed;
import hello.metrics.api.Greeting;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Random;

@Path("/greeting")
@Produces(MediaType.APPLICATION_JSON)
public class GreeterResource {

    private final MetricRegistry metricRegistry;

    public GreeterResource(MetricRegistry metricRegistry) {
        this.metricRegistry = metricRegistry;
    }

    @GET
    @Path("/")
    public Greeting greeting() {
        return new Greeting();
    }

    @GET
    @Path("/timed-demo")
    @Timed(name = "hello.metrics.greeting.timed-demo")
    public Greeting timedDemoGreeting() {
        return new Greeting("Sup?", "Time Lord!");
    }

    @GET
    @Path("/gauge-demo")
    public Greeting greet() {
        metricRegistry.gauge("hello.metrics.greeting.gauge-demo",
                             (/* metric supplier */) -> this::gaugeDemoValue);
        return new Greeting("Hallo", "Herr Celsius");
    }

    private int gaugeDemoValue() {
        return new Random().nextInt(100);
    }
}
