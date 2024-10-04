package Stringbuilder;

public class ensurecapacity {
    public static void main(String args[])
    {
        StringBuilder in=new StringBuilder();
        System.out.println(in.capacity());
        in.append("sudhan");
        System.out.println(in.capacity());
        in.append("full stack development in java");
        System.out.println(in.capacity());
        in.ensureCapacity(30);
        System.out.println(in.capacity());
        in.ensureCapacity(52);
        System.out.println(in.capacity());
    }

}
