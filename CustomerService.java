
import java.time.LocalDate;
import java.time.Period;



public class CustomerService {
    public boolean isEmailValid (String email) {
        return email.contains("@");
    }
    public boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("+0");
    }
    public boolean isAdult(LocalDate dob) {
        return Period.between(dob, LocalDate.now()).getYears() > 16;
    }
    public boolean isValid (Customer customer) {
        return isEmailValid(customer.getEmail()) && isAdult(customer.getDob()) && isPhoneNumberValid(customer.getPhoneNumner());
    }
}
