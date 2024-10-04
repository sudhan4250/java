package String;
import java.util.StringTokenizer;

import static java.lang.System.*;

public class task3 {
    public static void main(String args[])
        {
            StringTokenizer st = new StringTokenizer("Hello Everyone Have a nice day"," ");
            out.println("Total number of Tokens: "+st.countTokens());
        }
    }


