package or;

public class task {
     static int count= 0;
    String a="tamil";
    String b="english";
    String c="maths";
    String d="social";
    String e="science";
    void name()
    {
         {
             this.count=count;
            System.out.println(count+ a);
             count=1+count;
        }
            }
    void name1()
    {
        System.out.println(count +b);
        count++;
    }
    void name2()
    {
        System.out.println(count+c);
        count++;
    }
    void name3()
    {
        System.out.println(count+d);
        count++;
    }
    void name4()
    {
        System.out.println(count+e);
        count++;
    }

    public static void main(String args[])
    {
        task in=new task();
        in.name();
        in.name1();


    }

}
