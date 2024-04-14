import hosting.ServiceContainer;
import services.CasualGreeter;
import services.FormalGreeter;
import services.Greeter;

class ProgramTest {
    public static void main(String[] args) throws Exception {
        Greeter cg = ServiceContainer.getService(Greeter.class, CasualGreeter.class);
        System.out.println(cg.greet("Benson"));
        System.out.println(cg.greet("Samson"));
        System.out.println("**************************************");
        Greeter fg = ServiceContainer.getService(Greeter.class, FormalGreeter.class);
        System.out.println(fg.greet("Benson"));
        System.out.println(fg.greet("Samson"));

    }
}
