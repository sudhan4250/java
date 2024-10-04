package method;
 public class method {
        void print()//non return+no parameter
        {
            System.out.println("welcome");
        }

        int welcomedrink(int a)//non return +with parameter
        {
            System.out.println("take your" + a + "glass of welcome drink");
            return a;
        }

        //int offer() {
           // return 100;


        public static void main(String[] args) {
            method obj = new method();
            obj.print();
            obj.welcomedrink(2);

        }
    }

