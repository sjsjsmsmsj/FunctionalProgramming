
import java.util.function.Predicate;



public class _Predicate {
    public static void main(String[] args) {
        System.out.println(isPhoneNumberValid("07000000000"));
        System.out.println(isPhoneNumberValid("0393494"));
        System.out.println(isPhoneNumberValid("034949"));
        System.out.println(isPhoneNumberValidPredicate.test("0394938438"));
    }
    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("07")&& phoneNumber.length() == 11;
    }
    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber -> phoneNumber.startsWith("07") && phoneNumber.length() == 11;
}
