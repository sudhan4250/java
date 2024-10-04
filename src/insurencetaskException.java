import java.util.Scanner;

public class insurencetaskException extends Exception
{
    static Scanner in=new Scanner(System.in);
    static String vehicle="lembogani";
    static int insurenceID=123-456-6987;


    public static void main(String[] args) {
        System.out.println("Enter your name");
        String name=in.next();


        try{
            if(name.equals("sudhan"))
            {
                System.out.println(name);
                System.out.println(vehicle);
                System.out.println(insurenceID);
            }
            else {
                throw new insurencetaskException();
            }

        }
        catch (Exception e)
        {
            System.err.println(e);
        }
    }


}
