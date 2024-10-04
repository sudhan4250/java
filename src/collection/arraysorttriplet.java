package collection;
// sort an Array of Triplet using java comparable and  comparator
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.*;
import java.io.*;
public class arraysorttriplet {
    int a;
    int b;
    int c;
    public arraysorttriplet(int a, int b, int c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public String toString()
    {
        return (" "+a+" "+b+" "+c);
    }
}
class name2 implements Comparator<arraysorttriplet>
{    @Override
    public int compare(arraysorttriplet o1, arraysorttriplet o2) {
        return o1.a-o2.c;
    }
}
class name3
{
    public static void main(String args[])
    {
        int n=4;
        arraysorttriplet a[]=new arraysorttriplet[n];
        a[0]=new arraysorttriplet(10, 20, 60);
        a[1]=new arraysorttriplet(30, 50, 70);
        a[2]=new arraysorttriplet(80, 60, 30);
        a[3]=new arraysorttriplet(100, 70, 40);
        Arrays.sort(a, new name2());
       name(a);
    }
    public static void name(arraysorttriplet[] a )
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }

}
