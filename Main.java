
import java.time.LocalDate;



public class Main {
    public static void main(String[] args) {
        Customer a = new Customer("thinh", "lamgiathinh05@gmail.com", "+0346519304", LocalDate.now());
        CustomerService valid = new CustomerService();
        System.out.println(valid.isValid(a));
    }
}
