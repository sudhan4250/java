package arraylist;

import inheritance.A;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class sort {
    public static void main(String[] args)
    {
    List on=new ArrayList();
        on.add("mango");
        on.add("apple");
        on.add("banana");
        on.add("grapes");
        Collections.sort(on);
        for(Object b:on)
        {
            System.out.println(b);
        }
        List o=new ArrayList();
        o.add(100);
        o.add(50);
        o.add(75);
        o.add(30);
        Collections.sort(o);
        for(Object c:o)
        {
            System.out.println(c);
        }
    }
}
