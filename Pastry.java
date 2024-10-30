public class Pastry {

  private String name;
  private double price;

  public Pastry() {
    this("croissant", 3);
  }

  public Pastry(String name, double price) {
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }

  public void setName(String newName) {
    name = newName;
  }

  public void setPrice(double newPrice) {
    if (newPrice < 0) {
      price = 0;
    }
    else {
      price = newPrice;
    }
  }
  
  public String toString() {
    return "Type: " + name + "\nPrice: " + price;
  }
  
}
