public class mall
{
    void welcome()
    {
        System.out.println("welcome");
    }
    void mobilebrand()
    {
        System.out.println("mobile brand available");
        System.out.println("1.vivo");
        System.out.println("2.oopo");
        System.out.println("3.poco");
        System.out.println("4.samsung");
        System.out.println("5.sony");
    }
    void cuppon(int a)
    {
        System.out.println("congrazz your getting" + a + "offer");
    }
    public static void main(String args[])
    {
        mall obj=new mall();
        obj.welcome();
        obj.mobilebrand();
        obj.cuppon(500);
    }


}
