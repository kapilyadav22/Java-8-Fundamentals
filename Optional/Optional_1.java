import java.util.NoSuchElementException;
import java.util.Optional;

public class Optional_1 {
    public static void main(String[] args) {
       Optional<String> name = getName(1);
       String nameTobeUsed = name.isPresent()?name.get():"Not Available";
       nameTobeUsed = name.orElse("Not Available");
       nameTobeUsed = name.orElseGet(() -> "Not Available");
       nameTobeUsed = name.orElseThrow(()->new NoSuchElementException("Not Available in Else Throw"));
       System.out.println(nameTobeUsed);


//       if(name.isPresent()){
//           System.out.println(name.get().toUpperCase());
//       }

       //Consumer
       name.ifPresent(n -> System.out.println(n.toUpperCase()));

       //method reference : if printing name
        name.ifPresent(System.out::println);

        //map
        Optional<String> optional = name.map(n -> n.toUpperCase());
        optional.ifPresent(System.out::println);

//        if(name!=null){
//            System.out.println(name.toUpperCase());
//        }
    }

    private static Optional<String> getName(int id){
        //return null;

        String name = "Kapil";
        //lets say we are getting name from database
        //return Optional.of(name);

        //use ofNullable, if name can be null
        return Optional.ofNullable(name);

        //Returns an empty Optional.
        //return Optional.empty();
    }

}


/*
Methods:
isPresent() : name is present or not
name.get() : Gets the value (throws if absent).
optional.ifPresent(consumer) :
empty() : return empty optional
name.orElse("Default Value") : name or default value
orElseGet(Supplier) : Returns value or result of supplier.
orElseThrow()	Throws exception if value is absent.
Optional.of(name) : Will throw error, if null
Optional.ofNullable(name) : will handle null
 */
