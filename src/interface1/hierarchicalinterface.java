package interface1;

interface hierarchicalinterface {
    void op();
}
class inheri implements hierarchicalinterface
{
    public void op()
    {
        System.out.println("hello");
    }
}
class hierarcy implements hierarchicalinterface
{
    public void op()
    {
        System.out.println("welcome");
    }
}
class out
{
    public static void main(String args[])
    {
        hierarchicalinterface in=new hierarcy();
        in.op();

    }
}