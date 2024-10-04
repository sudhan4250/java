     import javax.swing.*;
import java.util.Scanner;
import static java.lang.System.out;

public record atm() {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int withdraw, deposit;
        int balance = 1000;
        int code = 2002;
        int pin;

        out.println("Enter your pin : ");
        int b = in.nextInt();
        pin = b;

        if (pin == code)
        {
            while (true)
            {
                out.println("Automatter Teller Machine :");
                out.println("1. deposit");
                out.println("2. withdraw");
                out.println("3. balance");
                out.println("4. exit");
                out.println("choice your options : ");
                int a = in.nextInt();

                switch (a)
                {
                    case 1:
                        out.print("Enter your money:");
                        deposit = in.nextInt();
                        balance = balance + deposit;
                        out.println("Your money seccessfully deposited");
                        out.println("balance" + balance);
                        out.println("");
                        break;

                    case 2:
                        out.println("Enter your amount :");
                        withdraw = in.nextInt();

                        if (withdraw <= balance) {
                            balance = balance - withdraw;
                            out.println("Please collect your money");
                            out.println("balance" + balance);
                        } else {
                            out.println("Invalid Balance");
                        }
                        out.println("");
                        break;

                    case 3:
                        out.println("Balance" + balance);
                        out.println("");
                        break;

                    case 4:
                        System.exit(0);
                        break;

                    default:
                        out.println("Invalid option");
                }
            }

        }
        else
        {
            System.out.println("Invalid pin");
        }
    }
}








