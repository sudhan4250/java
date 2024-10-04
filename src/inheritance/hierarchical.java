package inheritance;

public class hierarchical
    {
       void grandpa()
        {
            System.out.println("welcome i'm grandpa");
        }

    }
    class place extends hierarchical
    {
        void father()
        {
            System.out.println("welcome i'm father");
        }
    }
    class place2 extends hierarchical
    {
        void son()
        {
            System.out.println("welcome i'm son of father");
        }
    }

    class place3 extends place2
    {
        void son2()
        {
            System.out.println("welcome i'm daughter of father");
        }
    }

    class or
    {
        public static void main(String args[])
        {
            place2 in=new place2();
            in.son();
            in.grandpa();
        }

    }
