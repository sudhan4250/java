package array;

import java.util.Scanner;

public class twodimension {
    public static void main(String args[]){
        int [][]a={{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(" "+a[i][j]);
            }
            System.out.println("");
        }

        int[][] b=new int[5][5];
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your number :");
        int c=in.nextInt();
        System.out.println("Enter your second number :");
        int d=in.nextInt();
        System.out.println("Enter"+(c*d)+"Array Elements: ");
        for(int i=0;i<c;i++)
        {
            for(int j=0;j<d;j++)
            {
                b[i][j]=in.nextInt();
                System.out.print(" "+b[i][j]);
            }
        }
        for(int i=0;i<c;i++)
        {
            for(int j=0;j<d;j++)
            {
                b[i][j]=in.nextInt();
                System.out.print(" "+b[i][j]);
            }
            System.out.println("");
        }

    }
//int[][] b=new int [][];
//int[][] c=new int [][][];

}
