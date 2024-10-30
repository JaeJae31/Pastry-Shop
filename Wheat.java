public class Wheat extends Bread {

  private boolean hasSeeds;

  public Wheat() {
    hasSeeds = true;
  }

  public Wheat(String name, double price, boolean sliced, boolean isToasted, boolean hasSeeds) {
    super(name, price, sliced, isToasted);
    this.hasSeeds = hasSeeds;
  }

  public void setHasSeeds(boolean itHasSeeds) {
    hasSeeds = itHasSeeds;
  }

  public String toString() {
    return super.toString() + "\nHas Seeds? " + hasSeeds;
  }
}
