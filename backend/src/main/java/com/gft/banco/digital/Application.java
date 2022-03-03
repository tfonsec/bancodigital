package com.gft.banco.digital;




public class Application {

	public static void main(String[] args) {


		Client client = new Client();
		client.setName("Thiago Fonseca");
		Bank bank = new Bank();
		bank.setName("GFT Internet Banking");
		Account cc = new CheckingAccount(client, bank);
		cc.deposit(1000);
		Account poupanca = new SavingsAccount(client, bank);
		cc.transfer(50, poupanca);


		cc.bankStatement();

		poupanca.bankStatement();
	}
}
