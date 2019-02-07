package snackBar;

public class Main {
  public static void buy(Customer customer, Snack snack, int amount) {
    customer.buy(snack.getTotal(amount));
    snack.buy(amount);

    System.out.println(customer.getName() + "'s cash on hand: " + customer.getCash() + "\n" +
                      "Quantity of " + snack.getName() + ": " + snack.getQuantity());
  }

  private static void instantiateAndProcess() {
    Customer jane = new Customer("Jane", 45.25);
    Customer bob = new Customer("Bob", 33.14);

    VendingMachine food = new VendingMachine("food");
    VendingMachine drink = new VendingMachine("drink");
    VendingMachine office = new VendingMachine("office");

    Snack chips = new Snack("chip", 36, 1.75, food.getId());
    Snack chocolateBar = new Snack("chocolate bar", 36, 1.00, food.getId());
    Snack pretzel = new Snack("pretzel", 30, 2.00, food.getId());

    Snack soda = new Snack("soda", 24, 2.50, drink.getId());
    Snack water = new Snack("water", 20, 2.75, drink.getId());

    buy(jane, soda, 3);
    buy(jane, pretzel, 1);
    buy(bob, soda, 2);

    jane.addCash(10);
    System.out.println("Cash on hand: " + jane.getCash());

    buy(jane, chocolateBar, 1);

    pretzel.addQuantity(12);
    System.out.println("Quantity of " + pretzel.getName() + ": " + pretzel.getQuantity());

    buy(bob, pretzel, 3);
  }

  public static void main(String[] args) {
    instantiateAndProcess();
  }
}
