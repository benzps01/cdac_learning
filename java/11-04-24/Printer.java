
//Here we create a generic type <T> which can accept any object as its type
import java.io.Serializable;

// Bounded Generic using extends which is interface.
public class Printer<T extends Serializable> {
    T a;

    public Printer(T a) {
        this.a = a;
    }

    public void print() {
        System.out.println(a);
    }
}