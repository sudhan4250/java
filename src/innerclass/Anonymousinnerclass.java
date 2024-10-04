package innerclass;

/*interface Anonymousinnerclass {
 void name();
}
class name
{
    public static void main(String args[])
    {
        Anonymousinnerclass o=new Anonymousinnerclass() {
            @Override
            public void name() {
                System.out.println("interface class in anonymous");
            }
        };
        o.name();
    }
}*/
abstract class Anonymous{
   abstract void name2();
}
class name
{
    public static void main(String args[])
    {
        Anonymous on=new Anonymous() {
            @Override
            public void name2() {
                System.out.println("abstract class in anonymous");
            }
        };
        on.name2();
    }

}