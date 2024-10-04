import java.util.Scanner;

public class name {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your num : ");
        int a=in.nextInt();
        for(int i=1;i<=a;i++)
        {
            for (int j=a-i;j>a;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=a*2-1;k++)
            {
                if(i % 2 == 0)
                {
                    System.out.println("1");
                }
                else
                {
                    System.out.println("0");
                }
                System.out.println("");
            }
        }

    }
}
