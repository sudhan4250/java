import java.util.Scanner;

public class z {
    public static void main(String args[])
    {
        Scanner in =new Scanner(System.in);
        int a=in.nextInt();
        int b=0;
        for(int i=0;i<a;i++)//0<5
        {
            for(int j=0;j<a;j++)//0<5
            {
                if (i==0||j+i==a-1||i==a-1){


                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }

            }
            System.out.println("");
        }
    }

}
