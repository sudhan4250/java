package array;

public class passingarguments {

    int[] name(int[] a)
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
           // return a;
        }
       return a;
    }
    public static void main(String args[])
    {
        passingarguments in=new passingarguments();
        in.name(new int[]{10,20,30,40,50,60});
    }
}
