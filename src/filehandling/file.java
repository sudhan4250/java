package filehandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class file {
    public static void main(String[] args)throws IOException {
        System.out.println("enter your numbers");

        int num=System.in.read();
        System.out.println(num);
        System.out.println(num-48);

        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader on=new BufferedReader(in);
        int num1=Integer.parseInt(on.readLine());
        System.out.println(num);

        }
 }

