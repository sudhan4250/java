import java.util.Scanner;

public class f {
    public static void main(String args[])
    {
        Scanner in =new Scanner(System.in);
        int a=in.nextInt();
        for(int i=0;i<a;i++)//0<5
        {
            for(int j=0;j<a;j++)//0<5
            {
                if(j==0||j==0||i==a/2)//
                    System.out.print("*");
                else
                    System.out.print(" ");

            }
            System.out.println("");
        }
    }
}