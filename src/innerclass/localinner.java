package innerclass;

class outerclass
{
    void display()
    {
       abstract class inner
        {
           void innerDisplay()
            {
                System.out.println("inner Display");
            }
        }
        //inner i=new inner();
        //i.innerDisplay();
    }
}
public class localinner {
    public static void main(String[] args) {
        outerclass o=new outerclass();
        o.display();

    }
}
