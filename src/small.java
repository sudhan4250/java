public class small
{
    private int num1;
    private int num2;
    private int num3;
    public int number(int num1, int num2, int num3)
    {
        this.num1=num1;
        this.num2=num2;
        this.num3=num3;
        return num1;
    }
    public int smallest()
    {
        int smallest=num1;
        if(num2<smallest)
        {
            smallest=num2;
        }
        if(num3<smallest)
        {
            smallest=num3;
        }
        return smallest;
    }
    public static void main(String args[])
    {
        small in=new small();
        in.number(5,2,1);
        System.out.println("smallest number is :" + in.smallest());
    }
}
