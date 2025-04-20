import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       List<String> list = new ArrayList<>();
       list.add("A");
       list.add("BC");
       list.add("CD");
//       list.sort(new stringComparator());
        list.sort((a,b) -> b.length()-a.length());
       System.out.println(list);

       List<Integer> list2 = new ArrayList<>();
       list2.add(1);
       list2.add(2);
       list2.sort(new intComparator());
       System.out.println(list2);
    }
}

class stringComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.length()-o2.length();
    }
}

class intComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        //if int <0, o1 comes before o2
        //if int >0, o1 comes after o2
        //if int =0, o1 and o2 are equal
        return o1-o2;
    }
}
