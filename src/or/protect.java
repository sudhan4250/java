package or;

public class protect {
    protected void on()
    {
        System.out.println("i'm protected :");
    }
    protected void in()
    {
        System.out.println("i'm a second protected :");
    }
    public static void main(String args[])
    {
        protect op=new protect();
        op.on();
        op.in();
    }

}
