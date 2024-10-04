package advancejava;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class stream1 {
    public static void main(String[] args) {
        List<Integer> op = Arrays.asList(1,2,5,7,8,10,22,90,40);
       List<Integer> on= op.stream().filter(a->a%2==0).collect(Collectors.toList());
        System.out.println(on);

      /*  for(int b:on)
        {
            System.out.println(b);
        }  */

        List<Integer>om= op.stream().filter(a->a%2!=0).collect(Collectors.toList());
        for(int c:om)
        {
            System.out.println(c);
        }

    }
}
