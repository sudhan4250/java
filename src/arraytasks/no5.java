package arraytasks;

public class no5 {
    static boolean a(int[] a,int b)
    {
        for (int n : a) {
            if (b == n) {
                return true;
            }
        }
        return false;
    }
    public static void main(String args[])
    {
       int a[]={10,20,30,40,50,60,70,80,90,100};
        System.out.println(a(a,50));
        System.out.println(a(a,120));
    }
}
