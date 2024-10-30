public class ChocolateChip extends Cookie {
  
  private int numCocoChips;

  public ChocolateChip() {
    numCocoChips = 5;
  }

  public ChocolateChip(String name, double price, boolean isChewy, int numCocoChips) {
    super(name, price, isChewy);
    this.numCocoChips = numCocoChips;
  }

  public void setNumCocoChips(int theNumCocoChips) {
    numCocoChips = theNumCocoChips;
  }

  public String toString(String name, double price, boolean isChewy, int numCocoChips) {
    return super.toString() + "\n# of Chocolate Chips: " + numCocoChips;
  }
}
