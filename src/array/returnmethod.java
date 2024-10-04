package array;

import java.util.Arrays;

public class returnmethod {
     int[] get(){
        return new int[]{10,20,30,40,50};
    }
    public static void main(String args[])
    {
        returnmethod in=new returnmethod();
       int a[]=in.get();
      for(int element :a)
       {
           System.out.println(element);
       }
    }
}
