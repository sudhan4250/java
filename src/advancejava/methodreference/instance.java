package advancejava.methodreference;
@FunctionalInterface
interface A1
{

    void add(int a);
}

public class instance {
    /*instance(int a)
    {
        System.out.println("i am cons");
    }*/
    static int  sum(int a)
    {
        System.out.println("hi"+a);
        return 11;
    }
    public static void main(String[] args) {
        //lambda
    /*    A1 ref=()-> System.out.println("welcome");
        ref.add();*/

      //  instance method reference
      /*  instance in=new instance();
        A1 ref=in::sum;
        ref.add(110);*/

        //condition parameter must be same.

      // static method reference
      /* A1 ref=instance::sum;
        ref.add(0);*/

        /*A1 ref=instance::new;
        ref.add(10);*/

    }
}
