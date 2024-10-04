package advancejava.optionalclass;

public class exceptiondemoo {
    //static String name; //Cannot invoke "String.length()" because "advancejava.optionalclass.exceptiondemoo.name" is null

    public static void main(String[] args) {

       String name=null;//Cannot invoke "String.length()" because "name" is null

        //   if(name!=null)

try {
    System.out.println(name.length());
}

catch (Exception e)
{
    System.out.println(e.getMessage());
}
        System.out.println("welcome");
    }
}
