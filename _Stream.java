import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class _Stream {
    public static void main(String[] args) {
        List<Person> people = List.of(
            new Person("Thinh", Gender.FEMALE),
            new Person("Thien", Gender.FEMALE),
            new Person("Thi", Gender.MALE)
        );

        List<Person> females = new ArrayList<>();
        for (Person person: people) {
            if (Gender.FEMALE.equals(person.gender)) {
                females.add(person);
            }
        }
        for (Person person : females) {
            System.out.println(person);
        }

        // declarative approach
        people.stream().filter(person -> Gender.FEMALE.equals(person.gender)).collect(Collectors.toList()).forEach(System.out::println);
        
        people.stream().map(person -> person.gender).collect(Collectors.toSet()).forEach(System.out::println);
                                                                                        // person in people -> person.gender
        people.stream()
                        .allMatch(person -> Gender.FEMALE.equals(person.gender));
    }
    static class Person {
        private final String name;
        private final Gender gender;
        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }
        @Override
        public String toString() {
            return "Person [name=" + name + ", gender=" + gender + "]";
        }
        
    }
    static enum Gender {
        FEMALE, MALE;
    }
}
