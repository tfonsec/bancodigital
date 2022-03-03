package com.gft.banco.digital;

import lombok.Getter;

@Getter
public abstract class Account implements IAccount {

    private static int DEFAULT_BANK_BRANCH = 1;
    private static int SEQUENCE = 1;
    protected int bankBranch;
    protected int number;
    protected double balance;
    protected Client client;
    protected Bank bank;




    public Account(Client client, Bank bank) {
        this.bankBranch = Account.DEFAULT_BANK_BRANCH;
        this.number = SEQUENCE ++;
        this.client = client;
        this.bank = bank;
    }


    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void transfer(double amount, Account destinationAccount) {
            this.withdraw(amount);
            destinationAccount.deposit(amount);
    }

    protected void defaultPrint() {
        System.out.println(String.format("Titular: %s", this.client.getName()));
        System.out.println(String.format("Banco: %s", this.bank.getName()));
        System.out.println(String.format("Agencia: %d", this.bankBranch));
        System.out.println(String.format("Número: %d", this.number));
        System.out.println(String.format("Saldo: %.2f", this.balance));
    }
}
