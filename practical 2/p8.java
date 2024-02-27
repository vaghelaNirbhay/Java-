public class p8 {

    private String depositorName;
    private int accountNumber;
    private String accountType;
    private double balance;

    // Constructor
    public p8(String depositorName, int accountNumber, String accountType, double initialBalance) {
        this.depositorName = depositorName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;

        if (initialBalance >= 1000) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance must be at least 1000 Rp. Setting balance to 1000 Rp.");
            this.balance = 1000;
        }
    }

    // Method to deposit 
    public void deposit(double amount) {
       
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposit successful. New balance: " + this.balance + " Rp.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to display
    public void displayDetails() {
        System.out.println("Depositor Name: " + this.depositorName);
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Account Type: " + this.accountType);
        System.out.println("Balance: " + this.balance + " Rp.");
    }

    public static void main(String[] args) {
        // Creating an instance of the BankAccount class
        p8 myAccount = new p8("Nirbhay", 123456789, "Savings", 1500);
        myAccount.deposit(500);
        myAccount.displayDetails();
    }
}
