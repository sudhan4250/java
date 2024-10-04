package inheritance;

 class parent {
   //int parent;


    int a = 10;

    void add() {
        int c = a + 100;
        System.out.println(c);
    }
}
class user extends parent
{
    int value=20;
    void sub()
    {
        System.out.println("subtraction");
    }
    public static void main(String args[])
    {
        user in=new user();
        in.sub();
        System.out.println(in.value);
        System.out.println(in.a);//also access parent
        in.add();
    }


}
