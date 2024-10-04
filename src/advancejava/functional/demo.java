package advancejava.functional;

interface demo {

        void dewali();
        static void crackers()
        {
            System.out.println("we have creackers");
        }
        default void wishes()
        {
            System.out.println("happy diwali1");
        }
    }
class sudhan{ //implements demo{

   /* @Override
    public void dewali() {
        System.out.println("diwali offer begins");
        wishes();
        //creackers();
    }*/

    public static void main(String[] args) {
        // demo.crackers();
      //  sudhan in=new sudhan();
       // in.dewali();
        demo obj=()->
        {
            System.out.println("happy diwali");
        };
        obj.dewali();
        obj.wishes();
        demo.crackers();
    }
}
