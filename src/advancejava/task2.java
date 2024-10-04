package advancejava;

import java.util.Scanner;

 class Task2 {
     static Scanner in = new Scanner(System.in);
     static int a;
     static String c = "sudhan";

     public static void main(String args[]) throws IllegalAccessException {

         int password = 2002;
         System.out.println("Enter the id :");
         String b = in.nextLine();

         try {
             if (b.equals(c)) {
                 System.out.println("Enter the password :");
                 a = in.nextInt();
                 if (a == password) {
                     System.out.println("login successfull");
                 }
                 else{
                     throw new IllegalAccessException("reeneter :");
                 }

                 }
         } catch (Exception e) {

             if (a != password) {
                 for (int i = 0; i <10; i++) {
                     System.out.println("reenter password :");
                     int v = in.nextInt();
                     if (v == password) {

                         System.out.println("login successfull");
                         break;
                     }
                 }
             }

         }

         {

         }

     }
 }











