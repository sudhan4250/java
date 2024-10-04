package hashset;

import java.util.HashSet;
import java.util.Iterator;

// Write a Java program to compare two sets and retain elements which are same on both sets
public class ex3 {
    void name()
    {
        HashSet in=new HashSet();
        in.add(1);
        in.add(2);
        in.add(3);
        in.add(4);
        HashSet on=new HashSet();
        on.add(4);
        on.add(5);
        on.add(6);
        on.add(7);
        in.addAll(on);
        Iterator n=in.iterator();
        while(n.hasNext())
        {
            System.out.println(n.next());
        }
    }

    public static void main(String[] args) {
        ex3 p=new ex3();
        p.name();
    }

}
