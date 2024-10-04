import java.util.*;
public class task {

        public static void main(String args[]){
            //Initialize the scanner
            Scanner scan = new Scanner(" Int number is 21");
            //Iterate through the tokens
            while(scan.hasNext()){
                //Print int value
                if(scan.hasNextInt(8)){
                    System.out.println("Found Int Value: "+scan.next());
                }
                else{
                    scan.next();
                }
            }
            scan.close();
        }
    }

