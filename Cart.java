import java.util.ArrayList;

class Cart {
    private ArrayList<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public boolean removeItem(int itemid) {
        for (Item item : items) {
            if (item.getItemid() == itemid) {
                items.remove(item);
                return true;
            }
        }
        return false;
    }

    public void displayCart() {
        if (items.isEmpty()) {
            System.out.println("Cart is empty.");
        } else {
            System.out.println("Items in Cart:");
            for (Item item : items) {
                item.displayInfo();
            }
        }
    }

    public void checkout() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        System.out.println("Total price of items in cart: $" + total);
    }
}