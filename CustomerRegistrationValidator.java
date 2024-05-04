
import java.security.interfaces.RSAMultiPrimePrivateCrtKey;
import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;


public interface CustomerRegistrationValidator extends Function <Customer, combinatorpattern.ValidationResult> {
    static CustomerRegistrationValidator isEmailValid () {
        return customer -> customer.getEmail().contains("@") ? combinatorpattern.ValidationResult.SUCCESS : combinatorpattern.ValidationResult.EMAIL_NOT_VALID;
    }
    static CustomerRegistraitionValidator isPhoneNumberValid () {
        return customer -> customer.getPhoneNumner().startsWith("+0") ? combinatorpattern.ValidationResult.SUCCESS : combinatorpattern.ValidationResult.PHONE_NUMBER_NOT_VALID;
    }
    static CustomerRegistrationValidator isAnAdult () {
        return (customer) -> {
            Period.between(customer.getDob(), LocalDate.now()) > 16 ? combinatorpattern.ValidationResult.SUCCESS : combinatorpattern.ValidationResult.IS_NOT_AN_ADULT;
        }
    }

    default CustomerRegistrationValidator and (CustomerRegistrationValidator other) {
        return customer -> {
            ValidationResult result = this.apply(customer);
            return result.equals(combinatorpattern.ValidationResult.SUCCESS) ? other.apply(customer) : result;
        };
    } 
    static enum ValidationResult {
        SUCCESS,
        PHONE_NUMBER_NOT_VALID,
        EMAIL_NOT_VALID,
        IS_NOT_AN_ADULT
    } 
}
