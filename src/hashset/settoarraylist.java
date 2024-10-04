package hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

//Write a Java program to convert a hash set to a List/ArrayList
public class settoarraylist {
    void name()
    {
        HashSet in=new HashSet();
        in.add(1);
        in.add(2);
        in.add(3);
        in.add(4);
        System.out.println(in);
        List<Integer>on=new ArrayList<Integer>(in);
        System.out.println(on);

    }
    public static void main(String args[])
    {
        settoarraylist in=new settoarraylist();
        in.name();
    }

}
