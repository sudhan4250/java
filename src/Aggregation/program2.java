package Aggregation;

public class program2 {

    program1 pro;

    void main()
    {
        System.out.println(pro.a);
        System.out.println(pro.b);
    }

    program2(program1 on)
    {
           pro=on;
    }

    public static void main(String args[])
    {
       program1 in=new program1(10,5);
       program2 on=new program2(in);
       on.main();

    }

}
