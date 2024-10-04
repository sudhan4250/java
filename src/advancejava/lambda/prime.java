package advancejava.lambda;

import java.util.Scanner;
interface prime {
 void name(int b);
}
class noprime
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        prime obj = (b) -> {
            for (int i = 1; i <b; i++) {
                System.out.println("Enter your num:");
                int a=in.nextInt();
                String result= (a%2==0)?"prime":"not prime";
                System.out.println(result);
            }
        };
        obj.name(6);
    }
}

