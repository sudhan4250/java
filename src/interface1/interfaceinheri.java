package interface1;

interface interfaceinheri {
    void add();
}
interface multilevel extends interfaceinheri
{
   void sub();
}
interface process1 extends multilevel
{
    void div();
}
class selection implements process1
{
    public void add()
    {
        System.out.println("multilevel");
    }
    public void sub()
    {
        System.out.println("parent");
    }
    public void div()
    {
        System.out.println("child");
    }
    public static void main(String args[])
    {
        selection in=new selection();
        in.add();
        in.div();
        in.sub();
    }
}
