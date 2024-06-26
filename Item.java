
class Item {
    private int itemid;
    private double price;
    private String desc;
    private String title;
    private int quant;

    public Item(int itemid, double price, String desc, String title, int quant) {
        this.itemid = itemid;
        this.price = price;
        this.desc = desc;
        this.title = title;
        this.quant = quant;
    }

    public void displayInfo() {
        System.out.println("Item ID: " + itemid);
        System.out.println("Title: " + title);
        System.out.println("Description: " + desc);
        System.out.println("Price: " + price);
        System.out.println("Quantity in warehouse: " + quant);
        System.out.println();
    }

    public int getItemid() {
        return itemid;
    }

    public double getPrice() {
        return price;
    }
}