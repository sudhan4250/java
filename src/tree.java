import static java.lang.System.out;

public class tree {
            public static final int height = 5;

        public static void main(String[] args) {

            int width = 5;

            int space = width*5;

            int x = 1;

            for(int a = 1; a <= height; a++){

                for(int i = x;i <= width;i++){

                    for(int j = space;j >= i;j--){

                        out.print(" ");
                    }

                    for(int k = 1;k <= i;k++){

                        out.print("* ");
                    }

                    out.println();
                }

                x = x+2;
                width = width+2;
            }

            for(int i = 1;i <= 4;i++){

                for(int j = space-3;j >= 1;j--){

                    out.print(" ");
                }

                for(int k= 1;k <= 4;k++){
                    out.print("* ");
                }

                out.println();
            }
        }
    }


