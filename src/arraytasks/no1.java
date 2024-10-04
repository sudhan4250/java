package arraytasks;
import java.util.Arrays;
public class no1 {
//Write a Java program to sort a numeric array and a string array.
        public static void main(String[] args)
        {
            int[] a = {50,60,70,80,90,10,20};
            String[] b = {"roll no","id","name"};
            System.out.println("Original numeric array : " + Arrays.toString(a));
            Arrays.sort(a);
            System.out.println("Sorted numeric array : " + Arrays.toString(a));
            System.out.println("Original string array : " + Arrays.toString(b));
            Arrays.sort(b);
            System.out.println("Sorted string array : " + Arrays.toString(b));
        }
}

