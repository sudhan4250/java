public class example {

    static {
        System.out.println("hi");

    }

    example() {
        System.out.println("hi1");
    }
}
class name1 extends example{

    static {
        System.out.println("bye");
    }
    name1() {
        System.out.println("bye1");
    }

    public static void main(String args[]) {
           /* int a=5;//
            int b=10;//
           System.out.println(a<<b);*/
        new example();
        new name1();
    }
}

