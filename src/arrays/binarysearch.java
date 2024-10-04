package arrays;

import java.util.Arrays;

import static java.lang.System.*;

public class binarysearch {
    public static void main(String args[])
    {
        int a[]={10,20,30,40,50,60};
        //Arrays.sort(a);
        int intkey=50;
        out.println(intkey + "found at index: " +Arrays.binarySearch(a , intkey));
    }
}
