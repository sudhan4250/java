package array;

public class jaggedarray {
    public static void main(String args[]) {
        int[][] a = new int[4][];
        a[0] = new int[3];
        a[1] = new int[4];
        a[2] = new int[5];
        a[3] = new int[6];
        int cout = 0;
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[i].length; j++)
                a[i][j] = cout++;

                for (int i = 0; i < a.length; i++)
                {
                    for (int j = 0; j < a[i].length; j++)
                    {
                        System.out.println(" " + a[i][j]);
                    }
                    System.out.println();
                }

    }
}


