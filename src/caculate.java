import static java.lang.System.out;

public class caculate {

   /* int calculate(int b)
    {
        int accno=123;
        int newacc=accno+b;
        return newacc;
    }
    void name()
    {
        int
    }
    public static void main(String args[])
    {
        caculate op=new caculate();
        int value=op.calculate(10);
        //System.out.println(op.calculate(10));
        String are=value+"sudhan";
        System.out.println(are);
    }*/

    /*int add()
        {
            return 100;
        }
        public static  void main(String args[])
        {
            caculate obj=new caculate();
            obj.add();
            int i=obj.add();
            System.out.println(i);
        }
    }*/
   /* float add()
    {
        int a=10;
        float b=20.5f;
        return a+b;
    }
    public static void main(String args[])
    {
        caculate in=new caculate();
        System.out.println(in.add());
    }*/

    /* boolean check() {
         int i = 101;
         if (i < 100)
         {
             return true;
         } else
         {
             return false;
         }
     }
         public static void main (String args[])
         {
           caculate on=new caculate();
           boolean result=on.check();
           if(result)
           {
               out.println("your selected");
           }
           else {
               out.println("your not selected");
           }
         }*/
    int i;
     int x=2000;// global x can access all methods
    void print(int j) {
        i=i;
        //int x = 2000;// local variable x cannot use the another method.method.method
    }
    void display()
    {
        int z=100;
        out.println(z+i);
        out.println(x);
    }
    public static void main(String args[])
    {
        caculate in=new caculate();
        in.print(1000);
        in.display();
    }

}



