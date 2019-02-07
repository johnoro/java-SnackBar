package snackBar;

public class Snack {
  private static int currentId = 0;
  private int id;
  private String name;
  private int quantity;
  private double cost;
  private int vendingMachineId;

  public void Snack(String name, int amount, double cost, int vendingId) {
    this.name = name;
    quantity = amount;
    this.cost = cost;
    vendingMachineId = vendingId;
    id = currentId++;
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

  public int getQuantity() {
    return quantity;
  }

  public void addQuantity(int amount) {
    quantity += amount;
    if (quantity < 0) {
      quantity = 0;
    }
  }

  public void buy(int amount) {
    if (quantity >= amount) {
      quantity -= amount;
    }
  }

  public double getTotal(int quantity) {
    return cost * quantity;
  }
}
