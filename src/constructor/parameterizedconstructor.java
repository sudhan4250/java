package constructor;

public class parameterizedconstructor {
    int a;
    public parameterizedconstructor(int a,int b)
    {
        this.a=a;
        int c=a+b;
        System.out.println(c);
    }
    public static void main(String args[])
    {
        parameterizedconstructor in=new parameterizedconstructor(5,5);
    }
}
