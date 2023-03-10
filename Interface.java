import java.util.Scanner;
import java.lang.System;

class Interface {

  public void welcomeScreen() {

    Inventory in = new Inventory();
    Scanner sc = new Scanner(System.in);
    String input;
    
    while (true) {
      
      System.out.println("\nWelcome My Inventory Managment System\n");
      System.out.println("Items Avalable:\n");
      System.out.println("| Name | Description | Price | Stock |");

      in.listItems();
      // Items not being listed? I dont think they are being add to the list test this later with print
      
      System.out.println("\n\n\n[ Add ] a new item.");
      System.out.println("[ Remove ] a item.");
      System.out.println("[ Modify ] a item.");
      System.out.println("[ Save ] the list of items.");
      System.out.println("[ Exit ] the program.\n\n");

      input = sc.nextLine();

      switch (input.toUpperCase()) {
        case "ADD":
          this.add();
          break;
        case "REMOVE":
        case "MODIFY":
        case "SAVE":
        case "EXIT":
          sc.close();
          System.exit(0);
        default:
          System.out.println("Invalid Command");
      }
    }
  }

  public static void clearScreen() {  
    System.out.print("\033[H\033[2J");  
    System.out.flush();
  }  
  

  public void add() {

    String name, desc;
    double price;
    int stock;
    
    Inventory in = new Inventory();
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the name of the item:");
    name = sc.nextLine();
    System.out.println("Enter the description of the item:");
    desc = sc.nextLine();
    System.out.println("Enter the price of the item:");
    price = sc.nextDouble();
    System.out.println("Enter the amout of stock of this item:");
    stock = sc.nextInt();

    Item item = new Item(name, desc, price, stock);
  
    in.addItem(item);

    System.out.println("Item added successfuly!");

    clearScreen();
  }
  
}