package arraytasks;
//Write a Java program to sum values of an array.
public class no2 {
        public static void main(String[] args) {
            int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int sum = 0;
            for (int i : a)
               sum += i;
            System.out.println("The sum is " + sum);
        }
}


