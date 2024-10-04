package hashset;

import javax.net.ssl.SSLEngineResult;
import java.util.HashSet;

//Write a Java program to compare two hash sets
public class ex4 {
    void compare()
    {
        HashSet in=new HashSet();
        in.add(1);
        in.add(2);
        in.add(3);
        in.add(4);
        System.out.println(in);
        HashSet on=new HashSet();
        on.add(3);
        on.add(6);
        on.add(4);
        on.add(5);
        System.out.println(on);
        HashSet op=new HashSet();
        for(Object e : in)
        {
            System.out.println(on.contains(e) ? "yes" :"no");
        }
    }
    public static void main(String args[])
    {
        ex4 o=new ex4();
        o.compare();
    }
}
