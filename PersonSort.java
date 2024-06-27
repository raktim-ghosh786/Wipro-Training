import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonSort {
    public static void main(String[] args) {
    
        List<Person> people = new ArrayList<>();
        people.add(new Person("Akash", 29));
        people.add(new Person("Abhishek", 25));
        people.add(new Person("Sanoj", 35));
        people.add(new Person("Raktim", 24));

        // Sort the list by age using a lambda expression
        Collections.sort(people, (p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()));

        
        people.forEach(System.out::println);
    }
}