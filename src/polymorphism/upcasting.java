package polymorphism;

public class upcasting {
    int a, b;

    void name() {
        System.out.println("welcome to upcasting");
    }

    void add() {
        this.a = a;
        int b = 20;
        System.out.println(a + b);
    }
}

    class care1 extends upcasting
    {
        void name()
        {
            System.out.println("child upcasting");
        }
        void sub(int b)
        {
            this.b=b;
            int c=50;
            System.out.println(c-b);
        }
            public static void main(String[] args)
            {
             upcasting in=new care1();
             in.name();
             in.add();
             in.name();
             care1 on=(care1) in;//downcasting //child name reference name=(parent name)parent object
             on.name();
             on.add();
             on.name();
             on.sub(10);

            }

    }




