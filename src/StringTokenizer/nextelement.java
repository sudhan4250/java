package StringTokenizer;

import java.util.StringTokenizer;

public class nextelement {
    public static void main(String args[])
    {
        StringTokenizer in=new StringTokenizer("java full stack development");
        while(in.hasMoreTokens())
        {
            System.out.println(in.nextElement());
        }
    }
}
