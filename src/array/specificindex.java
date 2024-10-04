package array;
//Program to insert a element in specific index of array
import java.util.Arrays;

public class specificindex {
    public static void main(String args[]) {
        int[] a = new int[]{10, 20, 30, 40, 50, 60};
        //int[]c= a;
        int index = 2;
        int value = 70;
        System.out.println("before Insert :" + Arrays.toString(a));
        for (int i = a.length-1; i > index; i--)
        {
            a[i] = a[i - 1];
        }
        a[index]=value;
        System.out.println("after Insert :" + Arrays.toString(a));
    }
}



