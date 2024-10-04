package String;
//By Using equals() Method
//equalsIgnoreCase
//By Using == Operator // false came from new and uppercase
//By compareTo() Method // compare based on two values same out "0" or a>b first value high out"1" or b<a if b higher than a out"-1"
//BY compareToIgnoreCase()
public class equal {
    public static void main(String[] args)
    {
        String a="Sudhan";
        String b="Sudhan";
        String c=new String("Sudhan");
       // String z=new String("Sudhan");
        String d="Sudhan";
        String e="SUDHAN";
        //equal
        // System.out.println(a.equals(b));
        // System.out.println(a.equals(c));
        // System.out.println(a.equals(d));

        //equalsIgnorecase
        //System.out.println(a.equalsIgnoreCase(e));
        //System.out.println(a.equals(b));
        //System.out.println(a.equals(d));

        //== operator
       //System.out.println(a==b);
      //  System.out.println(a==c);
       //System.out.println(a==d);
      // System.out.println(c==z);
       // System.out.println(a==e);

        //compareTo()
        //System.out.println(a.compareTo(b));
        //System.out.println(a.compareTo(c));
        //System.out.println(a.compareTo(d));
        //System.out.println(a.compareToIgnoreCase(e));
    }
}
