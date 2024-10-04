package collections;
import java.util.*;
/* collections use to store data
before we use array to store the data .
Collection helps to storing and processing of data Efficiently

iterable interface is the root of all collections
List if u want store data line by line
 */

public class List {
    public static void main(String[] args) {
        int a[] = new int[5];//fixed size
        ArrayList<Integer> op = new ArrayList<Integer>();//flexible.supports redudancy, arraylist implemented by array in background
        //op.add(5);
        for (int i = 1; i <= 10; i++)

            op.add(i);

        System.out.println(op);

        System.out.println(op.get(1));
        op.set(1, 100);//update
        System.out.println(op);

        op.remove(3);
        System.out.println(op);

        op.contains(100);
        System.out.println(op);

        op.add(100);
        //op.add(100); redudancy
        //op.add(100)
        ArrayList<String> op1 = new ArrayList<String>();
        op1.add("sudhan");
        ArrayList op2 = new ArrayList<>();
        op2.add("sudhan");
        op2.add(2);
        System.out.println(op1);
        System.out.println(op2);

        for (int i : op) {
            System.out.println(i);
        }
        Iterator<Integer> i = op.iterator();
        System.out.println("using Iterator");
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        //System.out.println(i.next());

/*
Linked list implement by linked list data structure
easily modify and remove and add data
linked list stored a data in note space
 */

        LinkedList<Integer> in = new LinkedList<>();
        in.getFirst();

/*
Vector
this methods are syncnorized
using to thread safe implement
but performance is to low that's why we mostly use arraylist and linkedlist
 */
    }
}


