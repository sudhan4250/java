package advancejava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class largest {
    public static void main(String[] args) {
        List<Integer> op = Arrays.asList(10, 20, 30, 40, 90,100);
       /* Integer n=op.stream().distinct().sorted().skip(1).findFirst().orElse(null);
        System.out.println(n);*/
        Integer np=op.stream().distinct().sorted((a,b)->Integer.compare(b,a)).skip(1).findFirst().orElse(null);
        System.out.println(np);
    }
}

