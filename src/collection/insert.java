package collection;
// Write a Java program to insert an element into the array list at the first position.

import java.util.ArrayList;
import java.util.Iterator;

public class insert {
    void main()
    {
        ArrayList on=new ArrayList();
        on.add("apple");
        on.add("mango");
        on.add("banana");
        on.add("orange");
        on.add(0,"lemon");
        Iterator in=on.iterator();
        while(in.hasNext())
        {
            System.out.println(in.next());
        }
    }
    public static void main(String args[])
    {
        insert in=new insert();
        in.main();
    }
}
