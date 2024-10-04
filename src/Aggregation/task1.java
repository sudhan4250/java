package Aggregation;

public class task1 {

    task pro;

    void main()
    {
        System.out.println(pro.a+pro.b);
    }

    task1(task on)
    {
              pro=on;
    }
    public static void main(String args[])
    {
        task in=new task(10,20);
        task1 ss=new task1(in);
        ss.main();
    }
}
