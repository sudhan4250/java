package polymorphism;
// same Method name and different signature is called Methodoverloading;
public class Methodoverloading {

   void min()
    {
        System.out.println("hi i'm polymorphism");
    }
   public int  min(int a)
    {
        System.out.println(a);
        return a;
    }
    public byte min(byte a)
    {
        System.out.println("hi");
        return a;
    }
    public static void main(String[] args)
    {
        Methodoverloading in=new Methodoverloading();
        in.min();
        in.min(10);
        in.min((byte)5);
    }

}
