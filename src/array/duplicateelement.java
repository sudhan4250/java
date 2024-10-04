package array;
//write a program to print the duplicate element in an array
public class duplicateelement {
    public static void main(String args[])
    {
        int[] a=new int[]{10,20,30,40,40,20,50};
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
              if (a[i]==a[j]&& (i!=j))
              {
                  System.out.println("duplicate number :" + a[j]);
              }
            }
        }
    }
}
