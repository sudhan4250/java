package arraylist;
import java.util.ArrayList;
import java.util.Iterator;
public class ex1 {
    void name(){
        ArrayList <String> in=new ArrayList<String>();
        in.add("hello");
        in.add("i'm");
        in.add("a");
        in.add("famous java");
        for(String e:in)
        {
            System.out.println(e);
        }
        System.out.println(in);
        Iterator on=in.iterator();
        while(on.hasNext())
        {
            System.out.println(on.next());
        }
    }
    public static void main(String[] args)
    {
 ex1 o=new ex1();
 o.name();
    }
}
