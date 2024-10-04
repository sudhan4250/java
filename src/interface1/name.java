package interface1;

interface  name {
    void add();
    void jio();
}
 abstract class op implements name
 {
     public void jio() {
         System.out.println("second");
     }

 }
 class name1 extends op {

     @Override
     public void add() {
         System.out.println("hello");
     }
     public static void main(String args[])
     {
         name1 in=new name1();
         in.add();
         in.jio();
     }
 }





