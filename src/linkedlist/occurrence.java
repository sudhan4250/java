package linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

/*public class occurrence {
    public static void main(String[] args) {
        LinkedList<String> al=new LinkedList<>();
        al.add("Mango");
        al.add("Apple");
        al.add("Banana");
        al.add("Grapes");
        System.out.println(al.removeFirstOccurrence("Mango"));
        System.out.println(al.removeLastOccurrence("Grapes"));
        System.out.println(al);
    }
}*/
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class occurrence {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Set<Integer> set = new HashSet<>();
        set.add(3);
        set.add(4);
        set.add(5);

        set.addAll(list); // Merge the Set into the List

        System.out.println("Merged List: " + set);
       // System.out.println(set.

    }
}

