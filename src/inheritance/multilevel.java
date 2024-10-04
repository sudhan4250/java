package inheritance;

public class multilevel
    {
        void grandpa()
        {
            System.out.println("welcome i'm grandpa");
        }

    }
class name extends multilevel
{
    void father()
    {
        System.out.println("welcome i'm father");
    }
}
class name2 extends name
{
    void son()
    {
        System.out.println("welcome i'm son of father");
    }
}

 class name3 extends name2
 {
     void son2()
     {
        System.out.println("welcome i'm daughter of father");
    }
}

    class in extends multilevel
    {
        public static void main(String args[])
        {
          name3 in=new name3();
          in.father();
          in.grandpa();
          in.son();
          in.son2();

        }

    }



