package polymorphism;

import java.lang.invoke.MethodHandle;

public class Methodoverriding {

    void name(int a) {

        System.out.println("hi");
        System.out.println(a);
    }
}
class cat extends Methodoverriding
{

    void name()
    {
        //super.name(10);
        System.out.println("babycat is eating");

    }
}
class model
{
    public static void main(String[] args)
    {
        cat in=new cat();
        in.name();
    }
}
