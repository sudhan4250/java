import java.util.function.*;

import static java.lang.System.out;

public class Kaleeswari {

    static int calculate()
    {
       int h=100+200;
       return h;
    }
    public static void main(String args[]) {
        Predicate<Integer> ref = (o) -> (o > -10) && (o < 10);
        boolean result = ref.test(41);
        out.println(result);

        Predicate<Integer> obj = a -> (a > 100);
        boolean result1 = obj.test(6789);
        out.println(result1);

        BiPredicate<Integer, Integer> obj1 = (b, c) -> (b > c);
        boolean result2 = obj1.test(102, 20);
        out.println(result2);

        BiPredicate<String, String> obj2 = (s1, s2) -> s1.equals(s2);
        boolean result3 = obj2.test("appless", "apple");
        out.println(result3);

        Function<String, Integer> aa = f -> f.length();
        out.println(aa.apply("i love india"));

        Consumer<String> bb = s ->
        {
            out.println(s.concat("goodboy"));
           // out.println(bb.accept("kesaraj"));
        };
            bb.accept("kesavraj");


            Supplier<Integer> ss = () -> Kaleeswari.calculate();
            out.println(ss.get());

    }
}
