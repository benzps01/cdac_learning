package services;

public class FormalGreeter implements Greeter {
    public FormalGreeter() {
        System.out.println("Formal Greeter Activated..!!");
    }

    public String greet(String person) {
        return "Hello " + person;
    }
}
