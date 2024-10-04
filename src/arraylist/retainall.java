package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class retainall {
    public static void main(String args[])
    {
        ArrayList in=new ArrayList();
        in.add("Mango");
        in.add("apple");
        in.add("banana");
        in.add("grapes");
        ArrayList on=new ArrayList<>();
        on.add("orange");
        on.add("Mango");
        on.retainAll(in);
        Iterator n=on.iterator();
        while(n.hasNext())
        {
            System.out.println(n.next());
        }
    }
}
