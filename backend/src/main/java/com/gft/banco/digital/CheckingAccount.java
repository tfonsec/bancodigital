package com.gft.banco.digital;

import lombok.Getter;

@Getter
public class CheckingAccount extends Account {


    public CheckingAccount(Client client, Bank bank) {
        super(client, bank);
    }

    @Override
    public void bankStatement() {
        System.out.println("===Extrato Conta Corrente===");
       super.defaultPrint();
    }


}
