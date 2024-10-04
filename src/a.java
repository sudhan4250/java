public class a {
    int a=10;
    static int s=20;
    static void print()
    {
        int b=30;
        a in=new a();
        int result=in.a+b+s;
    }
    public static void main(String args[])
    {
        a obj=new a();
        obj.print();
    }
}
