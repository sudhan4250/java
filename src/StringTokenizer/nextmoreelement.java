package StringTokenizer;

import java.util.StringTokenizer;

public class nextmoreelement {
    public static void main(String args[])
    {
        StringTokenizer in=new StringTokenizer("java full stack devevlopment");
        while(in.hasMoreElements())
        {
            System.out.println(in.nextToken());
        }
    }
}
