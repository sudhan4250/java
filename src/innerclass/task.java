package innerclass;

public class task {
    public void name1()
    {
        System.out.println("parent class");
    }
    class b{
        public static void name()
        {
            System.out.println("memberinner class");
        }
    }

    public static void main(String[] args) {
        task in=new task();
        task.b.name();
        in.name1();
    }
}
