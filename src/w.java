import javax.swing.*;
import java.util.Scanner;
public class w {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = a / 2;
        for (int i = 0; i < a; i++) {
            System.out.print("*");
            for (int j = 0; j <= a; j++) {
                if (j == a)
                    System.out.print("*");
                else if ((i >= a / 2) && j == a - b || j == b)
                    System.out.print("*");
                else {
                    System.out.println(" ");
                }
            }
            if (i >= b) {
                b++;
            }
            System.out.println("\n");
        }
    }
}
