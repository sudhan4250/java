package String;

import java.util.Scanner;

public class task {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your String :");
        String s=in.next();
        System.out.println("After reverse :");
        for(int i=s.length();i>0;i--)
        {
            System.out.print(s.charAt(i-1));
        }

    }



}
