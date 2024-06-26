import java.util.ArrayList;
import java.util.Scanner;

public class Warehouse {

    public static void displayInventory(ArrayList<Item> inventory) {
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            System.out.println("Items in Warehouse:");
            for (Item item : inventory) {
                item.displayInfo();
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Item> inventory = new ArrayList<>();
        inventory.add(new Item(1, 25.99, "first", "first", 20));
        inventory.add(new Item(2, 15.99, "second", "second", 10));
        inventory.add(new Item(3, 30.99, "third", "third", 5));

        Cart cart = new Cart();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nWarehouse Management System");
            System.out.println("1. Display Inventory");
            System.out.println("2. Add Item to Cart");
            System.out.println("3. Remove Item from Cart");
            System.out.println("4. Display Cart");
            System.out.println("5. Checkout");
            System.out.println("6. Exit");

            System.out.print("Enter your choice (1-6): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displayInventory(inventory);
                    break;
                case 2:
                    System.out.print("Enter item ID to add to cart: ");
                    int addItemId = scanner.nextInt();
                    for (Item item : inventory) {
                        if (item.getItemid() == addItemId) {
                            cart.addItem(item);
                            System.out.println("Item added to cart.");
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter item ID to remove from cart: ");
                    int removeItemId = scanner.nextInt();
                    if (cart.removeItem(removeItemId)) {
                        System.out.println("Item removed from cart.");
                    } else {
                        System.out.println("Item not found in cart.");
                    }
                    break;
                case 4:
                    cart.displayCart();
                    break;
                case 5:
                    cart.checkout();
                    break;
                case 6:
                    System.out.println("Exiting program. Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
        }
    }
}