package advancejava;
@FunctionalInterface
interface A {
    void add();
}
interface c
{
    int sub();
}
interface d
{
    void div(int a);
}
interface e
{
    int multi(int b);
}
class b
{
    public static void main(String[] args) {
        A obj=()-> System.out.println("adding");
        c obj1=()-> {
            System.out.println("subtraction");
            return 0;
        };
        d obj2=(a)->
        {
            int b=10;
        int c=a+b;
            System.out.println(c);
        };
        e obj3=(b)->
        {
            int a=20;
            int c=b+a;
            return c;
        };
        obj.add();
        obj1.sub();
        obj2.div(20);
        int resullt=obj3.multi(50);
        System.out.println(resullt);
    }
}
