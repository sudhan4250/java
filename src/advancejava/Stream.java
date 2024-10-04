package advancejava;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        List<Integer> p = Arrays.asList(2, 3, 7, 9, 89, 90, 34);
        System.out.println(p);
     //List<Integer>newlist=p.stream().filter(a->a<10).distinct().map(b->b*2).forEach(System.out::println);//collect(Collectors.toList());

        //p.stream().filter(a->a<10).distinct().map(b->b*2).forEach(System.out::println);
        p.stream().filter(a->a<10).distinct().map(b->b*2).forEachOrdered(System.out::println);
       // System.out.println(newlist);
    }
}
