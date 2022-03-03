package com.gft.banco.digital;

import lombok.Getter;

@Getter
public class SavingsAccount extends Account {


    public SavingsAccount(Client client) {
        super(client);
    }

    @Override
    public void bankStatement() {
        System.out.println("===Extrato Conta Poupança===");
        super.defaultPrint();
    }

}
