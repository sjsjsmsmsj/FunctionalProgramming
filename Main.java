
import java.util.Optional;



public class Main {
    public static void main(String[] args) {
        Object a = Optional.ofNullable(null)
            .orElseGet(() -> "default value");
        System.out.println(a);

        Object b = Optional.ofNullable("Hello").orElseThrow(() -> new IllegalStateException("exception"));
        System.out.println(b);

        Optional.ofNullable("Thinh").ifPresent( (email) -> System.out.println("Sending email to " + email));
    }
}
