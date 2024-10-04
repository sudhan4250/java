package filehandling;
//how to create file using File class:
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class create {

    public void name()
    {
        String strname="", strpath="";
        try
        {
            BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter your file name :");
            strname=in.readLine();
            System.out.println("Enter your file path :");
            strpath=in.readLine();
            File on=new File(strpath+""+strname+".txt");
            on.createNewFile();
        }
        catch (Exception e)
        {

        }
    }
    public static void main(String args[])
    {
       create in=new create();
       in.name();
    }
}
//how to create file using File OutputStream class :
/*class create {

    public void name()
    {
        String strname="", strpath="";
        try
        {
            BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter your file name :");
            strname=in.readLine();
            System.out.println("Enter your file path :");
            strpath=in.readLine();
            FileOutputStream on=new FileOutputStream(strpath+""+strname+".txt");

        }
        catch (Exception e)
        {

        }
    }
    public static void main(String args[])
    {
        create in=new create();
        in.name();
    }
}*/
