package collection;
import java.util.ArrayList;
import java.util.Iterator;
//Write a Java program to create an array list, add some colors (strings) and print out the collection.
public class ex1 {
         void main()

        {
            ArrayList in=new ArrayList();
            in.add("red");
            in.add("blue");
            in.add("green");
            in.add("black");
            Iterator p=in.iterator();
            while(p.hasNext())
            {
                System.out.println(p.next());
            }
        }
        public static void main(String args[])
        {
            ex1 on=new ex1();
            on.main();
        }
    }


