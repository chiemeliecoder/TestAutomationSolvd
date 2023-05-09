package com.laba.solvd.A2.Problem4;

public class CustomExceptions {
  public void login(String username, String password) throws InvalidUsernameException, InvalidPasswordException {

    if (username == null || username.isEmpty()) {
      throw new InvalidUsernameException();
    }
    if (password == null || password.isEmpty()) {
      throw new InvalidPasswordException();
    }
    // perform login logic
  }

  public void withdraw(double amount) throws InsufficientFundsException {
    double balance = 0.00;
    if (amount > balance) {
      throw new InsufficientFundsException();
    }
    // withdraw the amount
  }

  public void processInput(String input) throws InvalidInputException {
    if (input == null || input.isEmpty()) {
      throw new InvalidInputException();
    }
    // process the input
  }

  public void fetchData() throws NetworkErrorException {
    // make network request
    boolean errorOccurred = false;
    if (errorOccurred) {
      throw new NetworkErrorException();
    }
    // process data
  }


}
