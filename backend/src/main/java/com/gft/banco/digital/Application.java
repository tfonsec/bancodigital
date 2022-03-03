package com.gft.banco.digital;




public class Application {

	public static void main(String[] args) {


		Client client = new Client();
		client.setName("Thiago Fonseca");
		Account cc = new CheckingAccount(client);
		cc.deposit(1000);
		Account poupanca = new SavingsAccount(client);
		cc.transfer(50, poupanca);


		cc.bankStatement();

		poupanca.bankStatement();
	}
}
