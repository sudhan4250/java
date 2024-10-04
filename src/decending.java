import java.util.Scanner;

import static java.lang.System.out;

public class decending {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        out.println("Enter your num : ");
        int a=in.nextInt();
        int b=a-1;//3-1=2
        int n=1;//1
        for(int i=0;i<a;i++)//0<3

        {
            for(int j=0;j<a;j++)//0<3
                out.print(" ");
            for(int j=0;j<a;j++) //0<3 1<3 2<3
            {
                if ((j == 0) || (j == (n - 1)))//0==0 1==0 1==0
                {
                    out.print(1);
                } else
                {
                    out.print(0);

                }
                b=b-1;
                n=n+2;

            }
            out.println();


        }

    }
}
