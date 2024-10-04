package multithreading;

public class new1 extends Thread{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println(i);
        }
    }
    public static void main(String args[])
    {
        new1 in=new new1();
        new1 on=new new1();
        in.start();
        on.start();
        for(int i=0;i<5;i++)
        {
            System.out.println("main"+i);
        }
    }

}
