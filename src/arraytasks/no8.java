package arraytasks;

import java.util.Arrays;

//Write a Java program to copy an array by iterating the array.
public class no8 {

    public static void main(String rgs[])
    {
        int a[]={10,20,30,40,50,60,70,80,90,100};
        System.out.println("the old array : "+Arrays.toString(a));
        int b[]=new int[10];
        for(int i=0;i<a.length;i++)
        {
            b[i]=a[i];
        }
        System.out.println(" the new array:"+Arrays.toString(b));
    }
}
