/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atm;

/**
 *
 * @author user
 */
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        
        BankAccount.setAtmLocation("Main Street Branch");
        BankAccount.setMaximumWithdrawalLimit(500);

        
        BankAccount account = new BankAccount("RWASA Pierre", 1000);

        
        System.out.println("ATM Location: " + BankAccount.getAtmLocation());
        System.out.println("Maximum Withdrawal Limit: $" + BankAccount.getMaximumWithdrawalLimit());
        account.displayAccountInfo();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter withdrawal amount: ");
        double amount = scanner.nextDouble();
        if (account.withdraw(amount)) {
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Withdrawal unsuccessful. Insufficient funds or exceeds withdrawal limit.");
        }

        account.displayAccountInfo();
        scanner.close();
    }
}

class BankAccount {
    private String accountHolder;
    private double balance;

    private static String atmLocation;
    private static double maximumWithdrawalLimit;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    
    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public static String getAtmLocation() {
        return atmLocation;
    }

    public static void setAtmLocation(String atmLocation) {
        BankAccount.atmLocation = atmLocation;
    }

    public static double getMaximumWithdrawalLimit() {
        return maximumWithdrawalLimit;
    }

    public static void setMaximumWithdrawalLimit(double maximumWithdrawalLimit) {
        BankAccount.maximumWithdrawalLimit = maximumWithdrawalLimit;
    }

    
    public boolean withdraw(double amount) {
        if (amount <= balance && amount <= maximumWithdrawalLimit) {
            balance -= amount;
            return true;
        }
        return false;
    }

    
    public void displayAccountInfo() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Balance: $" + balance);
    }
}
