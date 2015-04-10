/**
  A credit card has a balance that can be changed by purchases and payments.
*/

public class CreditCard
{
  private double balance;

  /**
    Constructs a credit card with a zero balance.
  */
  public CreditCard()
  {
    balance = 0;
  }

  /**
    Makes a payment to credit card.
    @param amount the amount to pay
  */
  public void payment(double amount)
  {
    balance = balance - amount;
  }

  /**
    Makes a purchase with the credit card.
    @param amount the amount of the purchase
  */
  public void purchase(double amount)
  {
    balance = balance + amount;
  }

  /**
    Gets the current balance of the credit card
    @return the current balance
  */
  public double getBalance()
  {
    return balance;
  }
}