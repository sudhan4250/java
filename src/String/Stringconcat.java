package String;

import java.util.StringJoiner;

// +
//concat
//String Buliter
//format() use "%s%s"
//String.join use ""
//StringJoiner class
public class Stringconcat {
    public static void main(String args[])
    {
        // String a="Sudhan"+"JavaDeveloper";
        // System.out.println(a);
        //String a=50+50+"Sudhan"+"JavaDeveloper"+100+100;
        //System.out.println(a);

        //concat
        //String a="Sudhan";
        //String b="Java Developer";
        //String c=a.concat(b);
        //System.out.println(c);

        //String Buliter
        //StringBuilder a= new StringBuilder("Sudhan");
        //StringBuilder b= new StringBuilder("Java Developer");
        //StringBuilder c=a.append(b);
        //System.out.println(c.toString());

        //format() use"%s%s"
        //String a=new String("Sudhan");
        //String b=new String("Java Devleopr");
        //String c=String.format("%s%s",a,b);
        //System.out.println(c.toString());

        //String.join use ""
        //String a=new String("Sudhan");
        //String b=new String("Java Devleopr");
        //String c=String.join("",a,b);
        //System.out.println(c.toString());

        //Stringjoiner class
        StringJoiner in=new StringJoiner(",");
        in.add("Sudhan");
        in.add("Java Developer");
        System.out.println(in.toString());


    }
}
