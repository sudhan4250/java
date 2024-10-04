package advancejava.lambda;

import java.util.Scanner;


 interface even {
 void name(int b);

 }
     class name5 {
         public static void main(String args[]) {

             Scanner in = new Scanner(System.in);

             even obj = ( b) -> {
                 for (int i = 0; i < b; i++) {
                     int a = in.nextInt();
                     String result = (a % 2 == 0 ? "even" : "old");
                     System.out.println(result);
                 }

             };
             obj.name(100);
         }
     }





