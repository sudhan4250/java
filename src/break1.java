import static java.lang.System.out;

public class break1 {
    public static void main(String args[])
    {
        for(int i=1;i<=10;i++)
        {

            if(i==5)
            {
                break;
            }
            out.println(i);
        }
    }
}
