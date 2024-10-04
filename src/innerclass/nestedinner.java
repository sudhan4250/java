package innerclass;
class outer{
    int a=50;
    class inner
    {
        int b=58;
        void innerDisplay()
        {
            System.out.println("A"+a);
            System.out.println("B"+b);
        }
    }
    void outerDisplay()
    {
      inner in=new inner();
      in.innerDisplay();
        System.out.println("B from inner class by outer display :"+in.b);
    }
}
public class nestedinner {
    public static void main(String[] args) {

        outer on=new outer();
        on.outerDisplay();
        outer.inner i=new outer().new inner();//main method to access inner class
        i.innerDisplay();
    }
}
