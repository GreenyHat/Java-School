package POO.Ex_42.ResolutionOne;

import java.util.Scanner;

public class Bank {
    private Scanner scKey = new Scanner(System.in);

    public TestingBankAccount createNewAccount() {
        System.out.print("Name of the user: ");
        String user = scKey.next();

        System.out.print("Initial amount: ");
        double amount = scKey.nextDouble();

        TestingBankAccount newAccount = new TestingBankAccount(amount, user);

        System.out.println("Account created with user: " + user + " and amount: " + amount + "\n");
        return newAccount;
    }

    public void transferMoney(TestingBankAccount fromAccount, TestingBankAccount toAccount, double amount) {
        fromAccount.setExtractMoney(amount);
        toAccount.setAddMoney(amount);
    }

    public String getAccountInfo(TestingBankAccount account) {
        return account.getAccountInfo();
    }
}
