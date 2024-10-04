package inheritance;

public class A {
    int a=10;
    int c;
    void add()
    {
        c=a+10;
        System.out.println(c);

    }
}
class B extends A
{
    int n;
    int a=20;
    int d;
    void sub()
    {
        d=100-a;
        System.out.println(d);
    }
    public static void main(String args[])
    {
        B in=new B();

        in.add();
        //System.out.println(in.c);
        in.sub();
        System.out.println(in.a+in.a);
    }

}