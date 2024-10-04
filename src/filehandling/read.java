package filehandling;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

import static java.lang.System.*;
//Using BufferedReader class
//Using Scanner class
//Using File Reader class
//Reading the whole file in a List
//Read a text file as String

//Fist Scanner class
/*public class read {
    public static void main(String args[])
    {
        try {
            File in = new File("src/in/sudhan.java");
            Scanner on = new Scanner(in);
            while(on.hasNextLine())
            {
                System.out.println(on.nextLine());
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}*/
//BufferReader class
public class read {
    public static void main(String args[])
    {
        try {
            File in = new File("src/in/sudhan.java");
            BufferedReader on=new BufferedReader(new FileReader(in));
            String st;
            while((st= on.readLine())!=null)
            {
                out.println(st);
            }
        }
        catch (Exception e)
        {
            out.println(e);
        }
    }
}
//
