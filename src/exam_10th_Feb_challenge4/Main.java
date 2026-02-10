package exam_10th_Feb_challenge4;

public class Main {
    public static void main(String[] args) {

        // Create BankAccount with initial balance
        BankAccount account = new BankAccount(1000);

        // Perform operations
        account.deposit(500);
        account.withdraw(200);
    }
}
