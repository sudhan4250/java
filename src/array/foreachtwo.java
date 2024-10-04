package array;
//multi dimention using for each loop:
public class foreachtwo
{

        public static void main(String[] args) {
            int[][] contents = { { 88, 66, 79 }, { 56, 25, 39 }, { 58, 47, 69 } };

            System.out.println("Loop Using Enhanced for loop:");
            for (int[] eachRow : contents) {
                for (int j : eachRow) {
                    System.out.print(j +"\t");
                }
                System.out.println("");
            }
        }
    }

