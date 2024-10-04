package multithreading;

import static java.lang.System.*;

/*public class name
{
    public static void main(String args[])
    {
            int n=5;
            for(int i=0;i<n;i++)
            {
                names in=new names();
                in.start();
            }
    }
}
class names extends Thread
{
    public void run()
    {
        try
        {
            out.println(" name of multithreading  "+Thread.currentThread().getId());
        }
        catch (Exception e)
        {
            out.println("Exception is caught");
        }
    }
}*/
class TestJoinMethod2 extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            try{
                Thread.sleep(2000);
            }catch(Exception e){System.out.println(e);}
            System.out.println(i);
        }
    }
    public static void main(String args[]){
        TestJoinMethod2 t1=new TestJoinMethod2();
        TestJoinMethod2 t2=new TestJoinMethod2();
        TestJoinMethod2 t3=new TestJoinMethod2();
        t1.start();

        try{
            t1.join(4000);

        }catch(Exception e){System.out.println(e);}

        t2.start();
        t3.start();
    }
}



