import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getDBConnectionUrl());
        System.out.println(getDBConnectionUrlSupplier.get());
        System.out.println(getDB.get());
    }
    static String getDBConnectionUrl () {
        return "jdbc://localhost:5432/users";
    }
    static Supplier<String> getDBConnectionUrlSupplier = () -> "jdbc//localhost";
    static Supplier<List<String>> getDB = () -> List.of("dkfjdjfdjjf", "dkjfjdjjf");
}
