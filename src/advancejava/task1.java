package advancejava;

import java.util.ArrayList;
import java.util.function.Predicate;

public class task1 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("apple");
        list.add("mango");
        list.add("orange");
        list.add("sudhan");
        list.add("banana");
        Predicate<ArrayList> op=m->m.isEmpty();
        System.out.println(op.test(list));
    }
}
