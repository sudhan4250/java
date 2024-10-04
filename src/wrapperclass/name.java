package wrapperclass;

public class name {
    public static void main(String args[])
    {
        byte a=66;
        String b="78";
        Byte in=new Byte(a);
        Float on=new Float(b);
        System.out.println("\n Byte object : "+in);
        System.out.println("\n Byte object : "+on);
        short c=65;
        String d="78";
        Short an=new Short(c);
        Short n=new Short(d);
        System.out.println("\n Short object :"+an);
        System.out.println("\n Short object :"+n);
        int v=100;
        String str=Integer.toString(v);
        System.out.println("\n String object :"+str);
        String j="78";
        int z=Integer.parseInt(j);
        System.out.println("\n Integer object :"+z);
    }
}
