import java.util.Scanner;
public class pyramid {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.print("Enter the number of rows for the pyramid : ");

        for (int i = 1; i <= a; i++)//1<=5 2<=5 3<=5 4<=5
        {
            for (int j = a - i; j > 0; j--) //j=4 4>0 3>0 2>0 1>0
                System.out.print(" ");
            for (int k = 1; k <= ((i * 2) - 1); k++)//1<=1 //2<=3 3<=5 4<=7
            {
                if (i% 2 == 0)//1 2 3 4
                {
                    System.out.print("1");
                } else
                {
                    System.out.print("0");
                }
            }
            System.out.println();
        }

        in.close();
    }

}
