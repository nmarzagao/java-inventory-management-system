class Item {
  private String name;
  private String desc;
  private double price;
  private int qty;

  public Item(String name, String desc, double price, int qty) {
    this.name = name;
    this.desc = desc;
    this.price = price;
    this.qty = qty;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  } 

  public String getDesc() {
    return this.desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public double getPrice() {
    return this.price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getQty() {
    return this.qty;
  }

  public void setQty(int qty) {
    this.qty = qty;
  }

  public String toString() {
    return this.getName() + " | " + this.getDesc() + " | " + this.getPrice() + " | " + this.getQty();
  }
  
}