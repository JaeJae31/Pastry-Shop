import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {

    Pastry cannoli = new Pastry("cannoli", 8);

    Pastry croissant = new Pastry();

    Cookie sugar = new Cookie("sugar", 2, true);

    ChocolateChip coco = new ChocolateChip("chocolate chip", 3, true, 8);

    Bread white = new Bread("white", 7, true, true);

    Wheat wheat = new Wheat("wheat", 8, true, false, false);

    Danish strawberry = new Danish("strawberry", 8, "sweet");

    Danish cheese = new Danish("cheese", 7, "plain");
    
    System.out.println("Here our are types of Bread: ");
    System.out.println("-----------------------------");

    System.out.println(white);

    System.out.println("\n" + wheat);
   
    System.out.println("\nHere are our types of Cookies: ");
    System.out.println("-----------------------------");

    System.out.println(sugar);

    System.out.println("\n" + coco);

    System.out.println("\nThese are our types of Danish: ");
    System.out.println("-----------------------------");

    System.out.println(strawberry);

    System.out.println("\n" + cheese);

    System.out.println("Finally, here are our special Pastries: ");
    System.out.println("-----------------------------");

    System.out.println(cannoli);

    System.out.println("\n" + croissant);
    
  }
}
