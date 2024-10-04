package multithreading;
public class example extends Thread{
    public void run()
    {

        System.out.println("hello i'm Thread");
    }

    public static void main(String args[])
    {
        try
        {
            for(int i=0;i<4;i++) {
                Thread.sleep(2000);
                System.out.println(i);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        example in=new example();
        in.start();
    }


}
