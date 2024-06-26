import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    @Override
    public String toString() {
        return "Node [data=" + data + ", next=" + next + "]";
    }
}

public class linkedList2 {
    private Node head;

    public linkedList2() {
        this.head = null;
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    public boolean delete(int data) {
        if (head == null) {
            return false;
        }

        if (head.data == data) {
            head = head.next;
            return true;
        }

        Node currentNode = head;
        while (currentNode.next != null) {
            if (currentNode.next.data == data) {
                currentNode.next = currentNode.next.next;
                return true;
            }
            currentNode = currentNode.next;
        }

        return false;
    }

    public void display() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        linkedList2 list = new linkedList2();
        Scanner scanner = new Scanner(System.in);

        int choice = 0;
        while (choice != 4) {
            System.out.println("Linked List Operations:");
            System.out.println("1. Add a node");
            System.out.println("2. Delete a node");
            System.out.println("3. Display the linked list");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter data to add: ");
                    int dataToAdd = scanner.nextInt();
                    list.add(dataToAdd);
                    System.out.println("Node added.");
                }
                case 2 -> {
                    System.out.print("Enter data to delete: ");
                    int dataToDelete = scanner.nextInt();
                    if (list.delete(dataToDelete)) {
                        System.out.println("Node deleted.");
                    } else {
                        System.out.println("Node not found.");
                    }
                }
                    case 3 -> {
                        System.out.println("Linked list:");
                        list.display();
                }
                case 4 -> System.out.println("Exiting program.");
                default -> System.out.println("Invalid choice.");
            }
        }

        scanner.close();

    }
}
