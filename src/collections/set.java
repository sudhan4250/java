package collections;
import java.util.*;
/*
set means only store unique elements ,doesn't allow duplicate value
hashset=hasing concept use to implement
key value key % n , doesn't maintain order
but LinkedHashset maintain order
but TreeHashset maintain order sorted order.
*/
public class set {
    public static void main(String[] args) {
        HashSet<String> h=new HashSet<String>();
        h.add("sudhan");
        h.add("chandran");
        h.add("parvathi");
        h.add("nandhini");
        h.add("sudhan");
        System.out.println(h);

    }
}
