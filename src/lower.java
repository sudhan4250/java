import java.util.Scanner;

import static java.lang.System.*;

public class lower {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        out.println("Enter your number :");
        int line=in.nextInt();
        int space=line-1;
        int num=1;
        for(int i=1;i<=line;i++)
        {
            for(int j=0;j<space;j++)
            {
                out.println(" ");
                for(j=1;j<num;j++)
                {
                    out.print(j);
                }
                for( j=num;j>0;j--)
                {
                    out.print(j);
                }
                out.println("");
                num+=1;
                space--;
            }
        }
    }
}
