import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Fill {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Kapil", "Rahul", "Ravi"));
        Collections.fill(names, "None");
        System.out.println(names);

        //Fill on Custom Objects
        List<Person> people = new ArrayList<>(Arrays.asList(new Person("Alice",20), new Person("Bob",30)));
        Collections.fill(people, new Person("Unknown",0));
        System.out.println(people.get(0).name); // Output: Unknown
        System.out.println(people.get(1).name); // Output: Unknown
    }

    /*
        ✅ Works only on modifiable lists.
        ✅ Replaces existing elements but does NOT add or remove elements.
        ✅ List size remains the same after calling fill().
        ❌ Throws UnsupportedOperationException if the list is immutable (e.g., created with Arrays.asList()).
        ❌ Throws IndexOutOfBoundsException if the list is empty.
     */
}
