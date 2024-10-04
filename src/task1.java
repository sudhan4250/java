import java.util.Scanner;
import static java.lang.System.*;
public class task1 {
    float pi=3.14f;
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    void circle()
    {

        int perimeter;
        perimeter = (int) (2*pi*n);
        out.println("perimeter of circle :" + perimeter);
    }
    void area()
    {
        int circle;
        circle=(int)(n*n*pi);
        out.println("Area of circle is : " + circle);


    }

    public static void main(String args[])
    {
        out.println("Enter your radious :");

     task1 in=new task1();
     in.circle();
     in.area();

    }
}
