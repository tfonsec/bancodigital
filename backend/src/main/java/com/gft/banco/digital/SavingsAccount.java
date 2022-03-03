package com.gft.banco.digital;

import lombok.Getter;

@Getter
public class SavingsAccount extends Account {


    public SavingsAccount(Client client, Bank bank) {
        super(client, bank);

    }

    @Override
    public void bankStatement() {
        System.out.println("===Extrato Conta Poupança===");
        super.defaultPrint();
    }

}
