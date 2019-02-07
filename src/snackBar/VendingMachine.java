package snackBar;

public class VendingMachine {
  private static int currentId = 0;
  private int id;
  private String name;

  public void VendingMachine(String name) {
    this.name = name;
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
}
