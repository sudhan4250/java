import static java.lang.System.out;

public class parameter {
    int n;


    int area(int n)
    {
        this.n = n;
        return n;
    }
    int circle( )
    {

        int perimeter;
        int pi = (int) 3.14;
        perimeter = (int) (this.n * pi * this.n);
        out.println("perimeter of circle :" +perimeter);
        return perimeter;
    }

    int square() {
        int name;
        name = n * n;
        out.println("square :" + name);
        return name;
    }

    float triangle() {
        float h = 10.0f;
        float name1=0.5f*h* this.n;
        out.println("triange :" +name1);
        return name1;
    }

    public static void main(String args[])
    {
        parameter n=new parameter();
        //n.circle(100);
        //n.square();
        //n.triangle();
        float totalvariable=n.area(5)+ n.circle()+ n.square()+ n.triangle();
        out.println("totalvariable :" + totalvariable);

    }

}
