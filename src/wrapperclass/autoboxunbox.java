package wrapperclass;

public class autoboxunbox {
    public static void main(String args[])
    {
        int i=10;
        float f;
        Integer in=Integer.valueOf(i);//Boxing,wrapping
        int j=in.intValue();//unboxing
        Integer  on=20;// automatically jvm convert Integer,valueOf(20)-autoboxing
        int k=in;//autounboxing
        String s="123467890";// String to integer
        int to=Integer.parseInt(s);
        System.out.println(to);
    }
}
