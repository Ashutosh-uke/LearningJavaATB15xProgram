package exam_10th_Feb_challenge4;

public class BankAccount {
    // Private field (encapsulation)
    private double balance;

    // Constructor to set initial balance
    BankAccount(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
        }
    }

    // Deposit method with validation
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Balance after deposit: " + balance);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Withdraw method with validation
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Balance after withdrawal: " + balance);
        }
    }

    // Getter method
    public double getBalance() {
        return balance;
    }
}
