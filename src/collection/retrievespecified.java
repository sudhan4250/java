package collection;

import java.util.ArrayList;

//4. Write a Java program to retrieve an element (at a specified index) from a given array list.
public class retrievespecified {
    void name()
    {
        ArrayList on=new ArrayList();
        on.add("Red");
        on.add("Blue");
        on.add("Green");
        on.add("Grey");
        System.out.println(on);
        System.out.println(on.get(0));
        System.out.println(on.get(2));
    }
    public static void main(String args[])
    {
        retrievespecified in=new retrievespecified();
        in.name();

    }
}
