
import java.util.function.Consumer;

//Call back

public class CallBacks {
    public static void main(String args[]) {
        hello("Lam", null, value -> {
            System.out.println("No lastName provided for " + value);
        });
    }
    static void hello(String firstName, String lastName, Consumer<String> callback) {
        System.out.println(firstName);
        if (lastName == null) {
            callback.accept(firstName);
        } else {
            System.out.println(lastName);
        }
    }
    // function hello(firstName, lastName, callback) {
    //     console.log(firstName);
    //     if (lastName) {
    //         console.log(lastName);
    //     } else {
    //         callback();
    //     }
    // } 

}
