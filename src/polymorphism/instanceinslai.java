package polymorphism;

public class  instanceinslai {
    void add(int a)
    {
        System.out.println(a);
    }
    int  add(int a, int b)
    {
        return b;
    }
    class name extends instanceinslai

    {
        void add(int a)
        {
            System.out.println("welcome");

        }
        public static void main(String args[])
        {
          //  name on=new name();

        }
    }

}
