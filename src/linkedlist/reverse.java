package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class reverse {
    public static void main(String args[])
    {
        LinkedList op=new LinkedList<>();
        op.add(10);
        op.add(20);
        op.add(30);
        op.add(40);
        Iterator i=op.descendingIterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}
