package Stringbuffer;

public class ensurecapacity {
    public static void main(String args[])
    {
        StringBuffer in=new StringBuffer();
        System.out.println(in.capacity());
        in.append("hello");
        System.out.println(in.capacity());
        in.append("java is most popular language");
        System.out.println(in.capacity());
        in.ensureCapacity(30);
        System.out.println(in.capacity());
        in.ensureCapacity(50);//(34*2=68+2=70)
        System.out.println(in.capacity());
    }
}
