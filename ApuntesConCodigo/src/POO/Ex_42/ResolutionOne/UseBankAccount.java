package POO.Ex_42.ResolutionOne;

import java.util.Scanner;

public class UseBankAccount {// Ej 42 de pildoras

    public static void main(String[] args) {

        Scanner scKey = new Scanner(System.in);

        // TestingBankAccount createAccount = new TestingBankAccount(0,null);

        Bank bank = new Bank();
        TestingBankAccount account1 = bank.createNewAccount();
        TestingBankAccount account2 = bank.createNewAccount();

        System.out.println("Enter amount to transfer: ");
        double amount = scKey.nextDouble();
        bank.transferMoney(account1, account2, amount);

        System.out.println("Account 1 information: ");
        System.out.println(bank.getAccountInfo(account1));
        System.out.println("\nAccount 2 information: ");
        System.out.println(bank.getAccountInfo(account2));
        scKey.close();

    }

}

/**
 * @deprecated
 */
// class Bank {

// public TestingBankAccount createNewAccount() {
// System.out.println("Name of the user: ");
// String user = scKey.next();

// System.out.println("Initial amount: ");
// double amount = scKey.nextDouble();

// TestingBankAccount newAccount = new TestingBankAccount(amount, user);

// System.out.println("Account created with user: " + user + " and amount: " +
// amount);
// return newAccount;
// }

// public void transferMoney(TestingBankAccount fromAccount, TestingBankAccount
// toAccount, double amount) {
// fromAccount.setExtractMoney(amount);
// toAccount.setAddMoney(amount);
// }

// public String getAccountInfo(TestingBankAccount account) {
// return account.getAccountInfo();
// }
// }
