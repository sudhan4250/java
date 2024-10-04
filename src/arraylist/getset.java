package arraylist;

import java.util.ArrayList;

public class getset {
    public static void main(String args[])
    {
        ArrayList in=new ArrayList();
        in.add("grapes");
        in.add("mango");
        in.add("apple");
        in.add("banana");
        System.out.println("arraylist :"+in.get(1));
        in.set(3,"lemon");
        for(Object a :in)
        {
            System.out.println(a);
        }
    }
}
