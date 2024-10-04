package Stringbuffer;

public class capacity {
    public static void main(String args[])
    {
        StringBuffer in=new StringBuffer();
        System.out.println(in.capacity());
        in.append("hello");
        System.out.println(in.capacity());
        in.append("java is a most popular language");
        System.out.println(in.capacity());
    }
}
