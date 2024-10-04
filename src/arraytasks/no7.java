package arraytasks;
import java.util.Arrays;
//Write a Java program to remove a specific element from an array.
public class no7 {
    public static void main(String args[])
    {
        int a[]={1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(a));
        int b=4;
        for(int i=b;i<a.length-1;i++)
        {
            a[i] += 1;
        }
        System.out.println(Arrays.toString(a));
    }
}
