package advancejava.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class sort {
    public static void main(String args[])
    {
        List<String>op= Arrays.asList("name","apple","mango","banana");
        op.stream().sorted().forEach(System.out::println);
    }

}
class collectionsort
{
    List<String>op= Arrays.asList("name","apple","mango","banana");
   // Collections.
}
