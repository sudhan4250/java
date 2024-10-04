package advancejava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class value {
    public static void main(String[] args) {
        ArrayList <String> list=new ArrayList<>();
        list.add("apple");
        list.add("mango");
        list.add("orange");
        list.add("sudhan");
        list.add("banana");
        Predicate<String> ab =bn->bn.startsWith("a")||bn.endsWith("a");
       for(String st: list) {
       if(ab.test(st))
           System.out.println(st);
       }
    }
}




