package StringTokenizer;

import java.util.StringTokenizer;
public class count {
    public static void main(String args[])
    {
        StringTokenizer in=new StringTokenizer("java full stack development");
        System.out.println(in.countTokens());
    }
}