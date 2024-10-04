package arraytasks;

import java.util.Arrays;

//Write a Java program to find the index of an array element.
public class no6 {
    public static void main(String args[])
    {
      int b[]={1,2,3,4,5,6,7,8,9};
        Arrays.sort(b);
        int c=9;
        System.out.println("index of an array :"+Arrays.binarySearch(b,c));
    }
}
