package hashset;

import java.util.HashSet;
//Write a Java program to remove all of the elements from a hash set
public class ex2 {
    void main(){
        HashSet on=new HashSet();
        on.add(10);
        on.add(20);
        on.add(30);
        on.add(40);
        System.out.println(on);
        System.out.println("remove all element :"+on.removeAll(on));
        on.clear();
        System.out.println(on);
    }
public static void main(String args[])
{
    ex2 in=new ex2();
    in.main();
}
}
