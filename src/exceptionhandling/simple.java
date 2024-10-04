package exceptionhandling;

import java.util.Comparator;

class exceptionhandling
    {
        public static void main(String args[])
        {
            int a=10;
            int b=0;
            int c=0;
            try //if u not give try catch b not divide by a so Arithmetic exception error show
            {
                c=a/b;// exception throw
            }
            catch (Exception e)
            {
                //System.err.println("Error occurred");
                throw new ArithmeticException("hello");
            }
            System.out.println(c);
            System.out.println("End of program");
        }

    }