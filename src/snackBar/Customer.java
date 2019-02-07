package snackBar;

public class Customer {
  private static int currentId = 0;
  private int id;
  private String name;
  private double cashOnHand;

  public Customer(String name, double cash) {
    this.name = name;
    cashOnHand = cash;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getCash() {
    return cashOnHand;
  }

  public void addCash(double amount) {
    cashOnHand += amount;
  }

  public void printCash() {
    System.out.println(name + "'s cash on hand: " + cashOnHand);
  }

  public void buy(Snack snack, int amount) {
    cashOnHand -= snack.getTotal(amount);
    snack.buy(amount);
    if (cashOnHand < 0) {
      System.out.println("Weee wooo, wee woo! \n" +
                        "The cops are after ya, no bankruptcy here!");
    }

    printCash();
    snack.printQuantity();
  }
}
