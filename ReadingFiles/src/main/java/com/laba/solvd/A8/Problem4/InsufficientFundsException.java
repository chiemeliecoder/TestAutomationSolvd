package com.laba.solvd.A8.Problem4;

public class InsufficientFundsException extends Exception{
  public InsufficientFundsException() {
    super("Insufficient funds in account");
  }

}
