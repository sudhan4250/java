package multithreading;

import static java.lang.System.out;
import static java.lang.System.*;

class on  implements Runnable
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
}

public class runnable {
        public static void main(String args[])
        {
            int n=5;
            for(int i=0;i<n;i++)
            {
                on op=new on();
                Thread thread=new Thread(op);
                thread.start();
            }
        }
    }


