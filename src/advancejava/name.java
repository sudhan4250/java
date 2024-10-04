package advancejava;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import static java.lang.System.out;

public class name {
    public static void main(String[] args) {
        Predicate<Integer>o=i->i>10;
        out.println(o.test(10));
        //Consumer<>

        Function<String, Integer> aa = n -> n.length();
        out.println(aa.apply("i love india"));
    }
}
