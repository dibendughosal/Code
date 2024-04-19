import java.util.HashMap;
import java.util.Map;

// Account class encapsulates account details
class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of $" + amount + " successful. New balance: $" + balance);
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful. New balance: $" + balance);
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    // Getter for account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }
}

// BankingSystem class encapsulates banking operations
class BankingSystem {
    private Map<String, Account> accounts;

    public BankingSystem() {
        this.accounts = new HashMap<>();
    }

    // Method to open a new account
    public void openAccount(String accountNumber, double initialBalance) {
        if (!accounts.containsKey(accountNumber)) {
            accounts.put(accountNumber, new Account(accountNumber, initialBalance));
            System.out.println("Account opened successfully.");
        } else {
            System.out.println("Account number already exists.");
        }
    }

    // Method to deposit money into an account
    public void deposit(String accountNumber, double amount) {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            account.deposit(amount);
        } else {
            System.out.println("Account does not exist.");
        }
    }

    // Method to withdraw money from an account
    public void withdraw(String accountNumber, double amount) {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            account.withdraw(amount);
        } else {
            System.out.println("Account does not exist.");
        }
    }

    // Method to get balance of an account
    public double getBalance(String accountNumber) {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            return account.getBalance();
        } else {
            System.out.println("Account does not exist.");
            return -1; // Return -1 to indicate account not found
        }
    }
}

public class BankingSystemDemo {
    public static void main(String[] args) {
        // Creating banking system
        BankingSystem bankingSystem = new BankingSystem();
        // Opening accounts
        bankingSystem.openAccount("123456", 1000);
        bankingSystem.openAccount("654321", 2000);
        // Depositing and withdrawing money
        bankingSystem.deposit("123456", 500);
        bankingSystem.withdraw("654321", 100);
        // Getting balance
        double balance = bankingSystem.getBalance("123456");
        if (balance != -1) {
            System.out.println("Balance of account 123456: $" + balance);
        }
    }
}