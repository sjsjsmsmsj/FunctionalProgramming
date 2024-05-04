import java.util.function.BiFunction;
import java.util.function.Consumer;

public class Lambdas {
    public static void main(String[] args) {
      // Premitives 
      Integer number = null;
      //int counter = null;
      int counter = 0;


      BiFunction<String, Integer,String> printName = (name, age) -> {
        if (name.isBlank()) throw new IllegalArgumentException("");
        System.out.println(age);
        return name.toUpperCase();
      };

      System.out.println(printName.apply("Thinh", 18));
    }
    class Servie {
      static Consumer<String> blah = s -> {
        
      };
    }
}