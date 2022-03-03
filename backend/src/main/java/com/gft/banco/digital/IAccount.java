package com.gft.banco.digital;

public interface IAccount {

  void withdraw (double amount);
  void deposit (double amount);
  void transfer(double amount, Account destinationAccount);

  void bankStatement ();

}
