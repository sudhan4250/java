package advancejava;
import java.util.ArrayList;

public class arraylistlambda {
    public static void main(String args[])
    {
        ArrayList<Integer> in=new ArrayList<>();
        in.add(0);
        in.add(1);
        in.add(2);
        in.add(3);
        in.forEach(n-> System.out.println(n));
        in.forEach(n->
        {
            if(n%2==0)
                System.out.println(n);
        });
    }
}
