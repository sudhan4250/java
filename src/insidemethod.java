   public class insidemethod
{
    static insidemethod in=new insidemethod();
    public void family()
    {
     sister();
     mother();
     father();
     brother();
    }
   static void sister()
   {
       System.out.println("movies");
   }
   public void mother()
   {
       System.out.println("shows");
   }
   public void father()
   {
       System.out.println("guid");
   }
   public void brother()
   {
       System.out.println("entertain");
   }
    public static void main(String args[])
    {
        in.family();

    }

}
