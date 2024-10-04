package advancejava;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


// using Stream.distinct() method
public class duplicate {

    public static void main(String[] args) {

        // 1. list of Strings
        List<Integer> a = new ArrayList<>();


        // 1.1 add string elements to List
        a.add(1);
        a.add(2);
        a.add(2);
        a.add(3);
        a.add(3); // duplicate
        a.add(4);
        a.add(5); // duplicate
       // List<Integer> op = a.stream().filter(b->b!set.add(a).//collect(Collectors.toList());
        /*for (Integer on : op) {
            a.remove(on);
        }
        a.forEach(System.out::println);*/

    }
}