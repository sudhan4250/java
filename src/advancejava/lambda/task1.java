package advancejava.lambda;
//write a java program to implement  lambda expression to find the sum of two integers
interface task1 {
    void add(int a ,int b);
}
class name{
    public static void main(String args[])
    {
        task1 obj=(a,b)-> System.out.println(a+b);
        obj.add(20,50);
    }
}
