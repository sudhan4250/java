package keyword;

public class thisk extends supers {
     thisk()
    {
        super(100);

        System.out.println("hi");
    }
    thisk(int b)
    {
        //this();
        int c=b+b;
        System.out.println(c);
    }
    public static void  main(String args[])
    {
        thisk  in=new thisk();

    }


}
