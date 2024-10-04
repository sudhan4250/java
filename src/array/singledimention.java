package array;

import java.util.Scanner;

public class singledimention {
    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        System.out.println(a[3]);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        int z=10;
       int b[];//Declaring array
        b= new int[z];// Allocating Memory for Array
        for (int element : b) {
            System.out.println(element);
        }
        for (int i = 0; i < 3 ; i++) {

            Scanner in = new Scanner(System.in);
            System.out.println("Enter your limit : ");
             b[i] = in.nextInt();
        }
        for(int element : b) {
            System.out.println(element);
        }
        }}








