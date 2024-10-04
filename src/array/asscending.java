package array;
// Ascending order
import java.util.Arrays;

public class asscending {
    public static void main(String args[])
    {
        int temp;
      int[] a=new int[]{100,90,80,70,60,50,40,30,20,10};
        System.out.println("before sort :" + Arrays.toString(a));
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)//i=0;
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("after sort : "+ Arrays.toString(a));
    }
}
