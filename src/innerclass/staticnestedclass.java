package innerclass;

public class staticnestedclass {
    static int d=50;
    static class name
    {
        void name() {
            System.out.println("d" + d);
        }

        class name3 {
            void name1() {
                System.out.println("static class name");
            }
        }
    }
    void name4()
    {
        name.name3 o=new name().new name3();
        name op=new name();
        op.name();
        o.name1();
    }
    public static void main(String args[]){
        staticnestedclass in=new staticnestedclass();
        in.name4();
    }
}
