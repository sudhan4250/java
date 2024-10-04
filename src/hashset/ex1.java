package hashset;

import java.util.HashSet;
import java.util.Iterator;

public class ex1 {
    public static void main(String args[]) {
        HashSet<Integer> in = new HashSet<Integer>();
        in.add(10);
        in.add(20);
        in.add(30);
        in.add(40);
        Iterator on = in.iterator();
        while(on.hasNext())
        {
            System.out.println(on.next());
        }
    }
}
