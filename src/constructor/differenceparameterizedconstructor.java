package constructor;

public class differenceparameterizedconstructor {
    public differenceparameterizedconstructor(int a)
    {
        System.out.println(a);
    }
    public differenceparameterizedconstructor(float a)
    {
        System.out.println(a);
    }
    public static void main(String args[])
    {
        differenceparameterizedconstructor in=new differenceparameterizedconstructor(5);
        differenceparameterizedconstructor on=new differenceparameterizedconstructor(15.0f);
    }

}
