package advance;
interface mcd {
    void burger();
     default void ketchup() {
        System.out.println("you got a shash");
    }
    static void Extracheese() {
        System.out.println("hello");
    }
}
class name
{
    public void burger()
    {
        System.out.println("i took 2 burger");
       // in.ketchup();
       mcd.Extracheese();
    }
        public static void main(String arsg[])
        {
          name in=new name();
          in.burger();
          //in.ketchup();
          //mcd.ketchup();
          //mcd.Extracheese();
        }
}