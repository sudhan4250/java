package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class comparablecomparator {
    String name;

    int price;
    int model;
    public String toString()
    {
        return name+" : "+price+" : "+model;
    }
    public comparablecomparator(String name,int price,int model)
    {
        this.name=name;
        this.price=price;
        this.model=model;
    }
    public static void main(String[] args) {
        ArrayList op = new ArrayList();
        comparablecomparator i = new comparablecomparator("Apple", 20000, 1);
        comparablecomparator o = new comparablecomparator("samsung", 20000, 12);
        comparablecomparator n = new comparablecomparator("oppo", 20000, 10);
        comparablecomparator m = new comparablecomparator("vivo", 20000, 11);
        op.add(i);
        op.add(o);
        op.add(n);
        op.add(m);
        System.out.println(op);
        name1 on = new name1();
        Collections.sort(op);
        System.out.println("sort price high to low " + op);
    }
    }

class name1 implements Comparable
{

    @Override
    public int compareTo(Object I){
        comparablecomparator one=(comparablecomparator)I;
        //comparablecomparator two=(comparablecomparator)J;
    //return ((comparablecomparator) o1).name.compareTo(one.name);

        if(one.price>one.price)
        {
            return 1;
        }
        if(one.price<one.price)
        {
            return -1;
        }
        else
        {
            if(one.model>one.model)
            {
                return 1;
            }
            if(one.model<one.model)
            {
                return -1;
            }
            else
                return 0;

        }
    }
}
