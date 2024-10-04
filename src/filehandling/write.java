package filehandling;
import java.io.File;
import java.io.FileWriter;
public class write {
    public static void main(String args[])
    {
        try {
            File in = new File("D://Example.txt");
            FileWriter on = new FileWriter(in);
            on.write(555);
            on.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
