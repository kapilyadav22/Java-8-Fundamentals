package TerminalOperations;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class forEach {
    //doesnt return any value
    public static void main(String[] args) {
        //List of came in java 9+
        List<String> names = List.of("A","B","C");

        //for java 8+,
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        list.stream().filter(x-> x%2==0).forEach(System.out::println);

    }
}
