package fullrevision;
//Input get two ways one BufferReader
//next Scanner Class
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// java have a various streams with its I/O package perform all input-output-operation.
// BufferReader throw a checked Exception
// The (System.in) is get byte and "InputStreamReader" convert byte to character and "BufferReader" get data.

public class input {
   /* public static void main(String[] args)
            throws IOException
    {

        BufferedReader on=new BufferedReader(new InputStreamReader(System.in));
        String str=on.readLine();
        int in=Integer.parseInt(on.readLine());
        System.out.println("Enter the String "+str);
        System.out.println("Enter the Integer "+in);
    }*/
   public static void main(String[] args) {
       try {
           BufferedReader i = new BufferedReader(new InputStreamReader(System.in));
           String str = i.readLine();
           int in = Integer.parseInt(i.readLine());
           System.out.println("Enter the String " + str);
           System.out.println("Enter the Integer " + in);
       }
       catch (Exception e)
       {

       }
   }
}
