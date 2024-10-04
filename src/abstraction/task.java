package abstraction;


import java.util.Scanner;

interface task {
    void add();
    void multi();
    void sub();
    void divide();
}
abstract class name2 implements task
{
    Scanner in= new Scanner(System.in);
    int a=in.nextInt();
    int b=in.nextInt();
    int c=in.nextInt();
    int d=in.nextInt();
    int e,f;

    @Override
    public void add() {
        int f=a+b;
        System.out.println(f);
        this.f=f;
    }
    @Override
    public void multi() {
        int e=c*d;
        System.out.println(e);
        this.e=e;
    }

    @Override
    public void sub() {
        int g=e-f;
        System.out.println(g);
    }
}
class name3 extends name2
{
    @Override
    public void divide() {
        int h=f/e;
        System.out.println(h);
    }
    public static void main(String args[])
    {
        name3 in=new name3();
        in.add();
        in.multi();
        in.sub();
        in.divide();

    }
}
