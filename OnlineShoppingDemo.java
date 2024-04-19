import java.util.ArrayList;
import java.util.List;

// Product class encapsulates product details
class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getters for product details
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

// ShoppingCart class encapsulates shopping cart functionality
class ShoppingCart {
    private List<Product> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    // Method to add a product to the shopping cart
    public void addProduct(Product product) {
        items.add(product);
    }

    // Method to calculate total price of items in the cart
    public double calculateTotalPrice() {
        double total = 0.0;
        for (Product item : items) {
            total += item.getPrice();
        }
        return total;
    }
}

// OnlineShoppingPlatform class encapsulates online shopping platform
// functionality
class OnlineShoppingPlatform {
    private List<Product> products;

    public OnlineShoppingPlatform() {
        // Initialize products
        this.products = new ArrayList<>();
        products.add(new Product("Laptop", 999.99));
        products.add(new Product("Smartphone", 599.99));
        products.add(new Product("Headphones", 99.99));
        // Add more products as needed
    }

    // Method to browse products
    public List<Product> browseProducts() {
        return products;
    }

    // Method to search for products by name
    public List<Product> searchProducts(String keyword) {
        List<Product> searchResults = new ArrayList<>();
        for (Product product : products) {
            if (product.getName().toLowerCase().contains(keyword.toLowerCase())) {
                searchResults.add(product);
            }
        }
        return searchResults;
    }

    // Method to simulate order fulfillment (abstracted)
    public void fulfillOrder(ShoppingCart cart) {
        // Simulate order fulfillment process (e.g., deducting items from inventory)
        // This process can be implemented separately and hidden from the user
        double totalPrice = cart.calculateTotalPrice();
        System.out.println("Order fulfilled successfully! Total Price: $" + totalPrice);
    }
}

public class OnlineShoppingDemo {
    public static void main(String[] args) {
        // Creating online shopping platform
        OnlineShoppingPlatform shoppingPlatform = new OnlineShoppingPlatform();
        // Browsing products
        List<Product> allProducts = shoppingPlatform.browseProducts();
        System.out.println("All Products:");
        for (Product product : allProducts) {
            System.out.println(product.getName() + " - $" + product.getPrice());
        }
        // Searching for products
        String keyword = "Laptop";
        List<Product> searchResults = shoppingPlatform.searchProducts(keyword);
        System.out.println("\nSearch Results for \"" + keyword + "\":");
        for (Product product : searchResults) {
            System.out.println(product.getName() + " - $" + product.getPrice());
        }
        // Simulating shopping cart and order fulfillment
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(allProducts.get(0)); // Adding a laptop to the cart
        cart.addProduct(allProducts.get(2)); // Adding headphones to the cart
        shoppingPlatform.fulfillOrder(cart);
    }
}