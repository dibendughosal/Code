import java.util.HashMap;
import java.util.Map;


class Item {
    private String name;
    private double price;
    private int quantity;

    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

class Inventory {
    private Map<String, Item> items;

    public Inventory() {
        this.items = new HashMap<>();
    }

    public void addItem(String name, double price, int quantity) {
        if (!items.containsKey(name)) {
            items.put(name, new Item(name, price, quantity));
            System.out.println("Item added to inventory: " + name);
        } else {
            System.out.println("Item already exists in inventory: " + name);
        }
    }
    
    public void removeItem(String name) {
        if (items.containsKey(name)) {
            items.remove(name);
            System.out.println("Item removed from inventory: " + name);
        } else {
            System.out.println("Item not found in inventory: " + name);
        }
    }
    
    public void updateQuantity(String name, int quantity) {
        if (items.containsKey(name)) {
            Item item = items.get(name);
            item.setQuantity(quantity);
            System.out.println("Quantity updated for item: " + name);
        } else {
            System.out.println("Item not found in inventory: " + name);
        }
    }
   
    public void displayInventory() {
        System.out.println("Current Inventory:");
        for (Item item : items.values()) {
            System.out.println("Name: " + item.getName() + ", Price: $" + item.getPrice() + ", Quantity: " +
                    item.getQuantity());
        }
    }
}

public class InventoryManagementSystem {
    public static void main(String[] args) {       
        Inventory inventory = new Inventory();
        
        inventory.addItem("Laptop", 899.99, 10);
        inventory.addItem("Smartphone", 499.99, 20);       
        inventory.displayInventory();
        inventory.updateQuantity("Laptop", 8);       
        inventory.removeItem("Smartphone");       
        inventory.displayInventory();
    }
}