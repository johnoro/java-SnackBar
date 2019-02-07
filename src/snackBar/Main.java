package snackBar;

public class Main {
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

    // processing
  }

  public static void main(String[] args) {
    instantiateAndProcess();
  }
}
