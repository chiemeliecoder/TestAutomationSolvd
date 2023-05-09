package com.laba.solvd.A2.Problem4;
import org.apache.log4j.Logger;



public class LoggerClass {
  private static final Logger logger = Logger.getLogger(LoggerClass.class);

  public static void main(String[] args){
    logger.info("Hello");
    System.out.println("Hi");

    try {
      CustomExceptions ce = new CustomExceptions();
      ce.login("Melie", "Melie200");
      ce.withdraw(100.00);
      ce.processInput("Shoe Purchase");
      ce.fetchData();
    } catch (InvalidUsernameException e) {
      logger.error("Invalid username entered", e);
    } catch (InvalidPasswordException e) {
      logger.error("Invalid password entered", e);
    } catch (InsufficientFundsException e) {
      logger.error("Insufficient funds in account", e);
    } catch (InvalidInputException e) {
      logger.error("Invalid input provided", e);
    } catch (NetworkErrorException e) {
      logger.error("There was a network error", e);
    }


  }


}
