import java.util.Scanner;

public class account {

    int widhdraw;
    int deposit;
    int balance;
    int amount;
    Scanner in=new Scanner(System.in);
    void account()
    {
        System.out.println("Enter your account number :");
        long a=in.nextInt();
        if(a==a) {
            System.out.println("your account is successfully verified ");
        }
    }
    void deposit()
    {
        System.out.println("Enter your deposit amount :");
        int a=in.nextInt();
        int balance=500;
        amount=balance+a;
        System.out.println("your balance is :" + amount);
    }
    void widhdraw()
    {
        System.out.println("Enter your widhdraw amount :");
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int value;
        if(1000>widhdraw)
        {

            value=deposit-widhdraw;
            System.out.println("balance " + value);
            }
        else
        {
            System.out.println("invalid balance");
        }


    }
    public static void main(String args[])
    {
        account in=new account();
        in.account();
        in.deposit();
        in.widhdraw();
    }
}
