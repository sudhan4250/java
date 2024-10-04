package tasks;

/*public class bank {


    // Account interface
    interface Account {
        void deposit(double amount);
        void withdraw(double amount);
        double calculateInterest();
        double getBalance();
    }

    // SavingsAccount class implementing Account interface
    class SavingsAccount implements Account {
        private double balance;
        private double interestRate;

        public SavingsAccount(double balance, double interestRate) {
            this.balance = balance;
            this.interestRate = interestRate;
        }

        @Override
        public void deposit(double amount) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }

        @Override
        public void withdraw(double amount) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
            } else {
                System.out.println("Insufficient funds");
            }
        }

        @Override
        public double calculateInterest() {
            return balance * interestRate;
        }

        @Override
        public double getBalance() {
            return balance;
        }

        // Unique method for SavingsAccount
        public void addInterest() {
            double interest = calculateInterest();
            deposit(interest);
            System.out.println("Interest added: " + interest);
        }
    }

    // CurrentAccount class implementing Account interface
    class CurrentAccount implements Account {
        private double balance;
        private double overdraftLimit;

        public CurrentAccount(double balance, double overdraftLimit) {
            this.balance = balance;
            this.overdraftLimit = overdraftLimit;
        }

        @Override
        public void deposit(double amount) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }

        @Override
        public void withdraw(double amount) {
            if (balance - amount >= -overdraftLimit) {
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
            } else {
                System.out.println("Exceeds overdraft limit");
            }
        }

        @Override
        public double calculateInterest() {
            // Current accounts do not earn interest
            return 0;
        }

        @Override
        public double getBalance() {
            return balance;
        }

        // Unique method for CurrentAccount
        public void setOverdraftLimit(double overdraftLimit) {
            this.overdraftLimit = overdraftLimit;
            System.out.println("Overdraft limit updated to: " + overdraftLimit);
        }
    }

    // Bank class to manage accounts
    class Bank {
        private List<Account> accounts;

        public Bank() {
            this.accounts = new ArrayList<>();
        }

        public void addAccount(Account account) {
            accounts.add(account);
        }

        public List<Account> getAccounts() {
            return accounts;
        }
    }

    public class Main {
        public static void main(String[] args) {
            Bank bank = new Bank();

            // Creating and adding accounts to the bank
            SavingsAccount savingsAccount = new SavingsAccount(1000, 0.05);
            CurrentAccount currentAccount = new CurrentAccount(500, 200);

            bank.addAccount(savingsAccount);
            bank.addAccount(currentAccount);

            // Depositing and withdrawing from accounts
            savingsAccount.deposit(500);
            currentAccount.withdraw(300);

            // Adding interest for SavingsAccount
            ((SavingsAccount) savingsAccount).addInterest();

            // Setting overdraft limit for CurrentAccount
            ((CurrentAccount) currentAccount).setOverdraftLimit(300);

            // Displaying balances
            for (Account account : bank.getAccounts()) {
                System.out.println("Balance: " + account.getBalance());
            }
        }
    }

}*/
