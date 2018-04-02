package hello.metrics.api;

public class Greeting {

    final String salutation;
    final String description;

    public Greeting() {
        this.salutation = "Hello";
        this.description = "Ya filthy animal";
    }

    public Greeting(String salutation, String description) {
        this.salutation = salutation;
        this.description = description;
    }

    public String getSalutation() {
        return salutation;
    }

    public String getDescription() {
        return description;
    }
}

