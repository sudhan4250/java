package advancejava.stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class one {
    public static void main(String[] args) {
      //  List<Integer> o= Arrays.asList(1,2,3,4,5,6);
        /*for(int i=0;i<6;i++)
        {
            System.out.println(o.get(i));
        }*/
        /*Iterator<Integer> op=o.iterator();
        while(op.hasNext())
        {
            System.out.println(op.next());
        }*/
       /* for( int i: o)
        {
            System.out.println(i);
        }*/
        //External Iterations
        //Internal Iterations
            Stream<Integer>s1= Stream.of(0,1,2,3,4,5,6);
        //s1.forEach(p-> System.out.println(p));
        Integer arr[]=new Integer[]{1,2,3,4,5,6};
        Stream<Integer> s2=Stream.of(arr);
        s2.forEach(p-> System.out.println(p));
            }
}
