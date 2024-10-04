package advancejava.optionalclass;
/*optional is class so it has objects.
* Optional object
* three are three types of optional object
* empty()
* of()
* ofNullable
* normal object is created by new keyword
* optional class in java.util package.*/

import javax.sound.midi.Soundbank;
import java.util.Optional;

public class A {
    public static void main(String[] args) {
        Optional obj=Optional.empty();
        Optional obj1=Optional.of(null);
        Optional obj2=Optional.ofNullable(null);
    }

}
class name
{
   static String branch()
    {
        return "we make it soon now";
    }
  static void add(int b)
    {
        System.out.println(b+100);
    }
    public static void main(String[] args) throws Throwable {
        String s="sudhan";
        Optional obj=Optional.of(s);//project
        System.out.println(obj);

        Optional obj1=Optional.ofNullable(null);
        System.out.println(obj1);
        System.out.println("sudhan");

        //Optional class methods
        /*
        * is present()
        * isEmpty()
        * ifPresent()
        * orElse()
        * orElseGet()
        * get()
        * orElseThrow()*/
        Optional<String> ss=Optional.ofNullable(null);
        System.out.println("ispresent ex" +ss.isPresent());

        Optional<String> as=Optional.ofNullable("Tamil");
        System.out.println("isempty ex" +as.isEmpty());

        as.ifPresent(a->{
             System.out.println(a.length());
        });

        ss.ifPresent(a->{
             System.out.println(a.length());
        });
        //orElse
        //System.out.println(ss.orElse("use me"));

        //ofElseget()
        System.out.println(ss.orElseGet(()->name.branch()));

        //orElseThrow()
        String vno=null;
        Optional op=Optional.ofNullable(vno);

        //op.orElseThrow(()->new IllegalAccessError());

        Integer a=20;

        Optional<Integer>in=Optional.ofNullable(a);
        in.ifPresent(b->name.add(a));

        System.out.println(ss.orElseThrow(()->new ArithmeticException("mpt divid by zero")));
    }
}
/*
* car showroom
* insurance company
* kalees->cae
* kesav-car
* sudhan-car
* class customer details
* class car details
* class insurance details
* class Main
* customar --->kesav
*/
class Name1
{
   static String s="india";
   static int[] arr ={10,20};
    public static void main(String[] args) {
        //System.out.println(s.length());
        Optional<String>input=Optional.ofNullable(s);
        input.ifPresent((a)-> System.out.println(a.length()));
        System.out.println(input.orElse("please enter a value first"));
        //System.out.println(input.orElse("" ));
    }
}