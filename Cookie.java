public class Cookie extends Pastry {
  
  private boolean isChewy;

  public Cookie() {
    isChewy = false;
  }

  public Cookie(String name, double price, boolean isChewy) {
    super(name, price);
    this.isChewy = isChewy;
  }

  public boolean getIsChewy() {
    return isChewy;
  }

  public void setIsChewy(boolean isItChewy) {
    isChewy = isItChewy;
  }

  public String toString() {
    return super.toString() + "\nIs It Chewy? " + isChewy;
  }
}
