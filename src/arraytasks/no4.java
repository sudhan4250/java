package arraytasks;
//Write a Java program to calculate the average value of array elements.
public class no4 {
    public static void main(String args[]) {
        int a[]=new int[]{1,2,3,4,5,6,7,8,9,10};
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum += a[i];
        }
        double average=sum/a.length;
        System.out.println(average);
    }
}
