import java.util.*;



public class Searching_On_Custom_Objects {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>(Arrays.asList(
                new Person("Kapil", 27),
                new Person("Rahul", 30),
                new Person("Vineet", 29)
        ));

        Comparator<Person> ageComparator = Comparator.comparingInt(p -> p.age);
        Collections.sort(people, ageComparator);
        //people.sort(people, ageComparator);

        int index = Collections.binarySearch(people, new Person("", 27), ageComparator);
        System.out.println("Index of Person with age 27: " + index);


        /*
        What if duplicate exists??
        it does not guarantee which index it will return. It will return
         one of the valid indices, but it may not always be the first or last occurrence.
         */
    }
}



