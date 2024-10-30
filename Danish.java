public class Danish extends Pastry {

  private String flavor;

  public Danish() {
    flavor = "cheese";
  }

  public Danish(String name, double price, String flavor) {
    super(name, price);
    this.flavor = flavor;
  }

  public String getFlavor() {
    return flavor;
  }

  public String toString() {
    return super.toString() + "\nFlavor: " + flavor;
  }
}
