package hashset;
//Write a Java program to convert a hash set to a tree set
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class hashsettotreeset {
    void name()
    {
        HashSet in=new HashSet();
        in.add(1);
        in.add(2);
        in.add(3);
        in.add(4);
        System.out.println(in);
        Set<Integer> op=new TreeSet<>(in);
        System.out.println(op);
    }
    public static void main(String[] args) {
        hashsettotreeset t=new hashsettotreeset();
        t.name();
    }
}
