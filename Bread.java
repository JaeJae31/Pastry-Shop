public class Bread extends Pastry {

  private boolean sliced;
  private boolean isToasted;

  public Bread() {
    sliced = false;
    isToasted = false;
  }

  public Bread(String name, double price, boolean sliced, boolean isToasted) {
    super(name, price);
    this.sliced = sliced;
    this.isToasted = isToasted;
  }

  public void setIsSliced(boolean isSliced) {
    sliced = isSliced;
  }

  public void setIsToasted(boolean toasted) {
    isToasted = toasted;
  }

  public String toString() {
    return super.toString() + "\nIs it Sliced? " + sliced + "\nIs it Toasted? " + isToasted;
  }
}
