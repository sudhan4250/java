package collection;

import java.util.ArrayList;
import java.util.Collections;

public class comparable implements Comparable{
    int a;
    int b;
    public comparable(int a,int b)
    {
        this.a=a;
    }
    public String toString()
    {
        return "Rs"+a;
    }


    @Override
    public int compareTo(Object o) {
        comparable i=((comparable)o);
        if(this.a>(i.a))
        {
             return -1;
        } else if (this. a<i.a) {
            return 1;
        }
        else {
            return 0;
        }
    }
    public static void main(String args[])
    {
        ArrayList i=new ArrayList();
        i.add("A");
        i.add("Z");
        i.add("C");
        i.add("I");
        Collections.sort(i);
        System.out.println("after sort "+i);
    }
}