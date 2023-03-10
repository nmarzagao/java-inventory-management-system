import java.util.List;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;

class Inventory {
  private List<Item> items;

  public Inventory() {
    this.items = new ArrayList<>();
  }

  public void addItem(Item item) {
    this.items.add(item);
  }

  public void removeItem(int index) {
    index--;
    this.items.remove(index);
  }

  public Item getItem(int index) {
    index--;
    return this.items.get(index); 
  }

  public void listItems() {
    for (Item i : this.items) {
      System.out.println((items.indexOf(i) + 1) + ". " + i.toString());
    }
  }

  public void saveItems() {
    try {
      FileWriter writer = new FileWriter("inventory.txt");
      writer.write("NAME | DESCRIPTION | PRICE | STOCK");
      writer.write(System.lineSeparator());
      for (Item i : this.items) {
        writer.write(i.toString());
        writer.write(System.lineSeparator());
      }
      System.out.println("Items have been saved");
      writer.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  // Make a load items method.
  
}