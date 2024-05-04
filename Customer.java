import java.time.LocalDate;

public class Customer {
    private final String name;
    private final String email;
    private final String phoneNumner;
    public String getPhoneNumner() {
        return phoneNumner;
    }
    private final LocalDate dob;
    public LocalDate getDob() {
        return dob;
    }
    public Customer(String name, String email, String phoneNumber, LocalDate dob) {
        this.name = name;
        this.email = email;
        this.phoneNumner = phoneNumber;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
