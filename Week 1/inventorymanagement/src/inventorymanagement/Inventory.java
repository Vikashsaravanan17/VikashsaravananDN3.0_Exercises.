package inventorymanagement;

import java.util.HashMap;

public class Inventory {
    private HashMap<String, Product> products;

    public Inventory() {
        this.products = new HashMap<>();
    }
    public void addProduct(Product product) {
        products.put(product.getProductId(), product);
        System.out.println("Product added: " + product);
    }
    public void updateProduct(Product product) {
        if (products.containsKey(product.getProductId())) {
            products.put(product.getProductId(), product);
            System.out.println("Product updated: " + product);
        } else {
            System.out.println("Product not found: " + product.getProductId());
        }
    }
    public void deleteProduct(String productId) {
        if (products.containsKey(productId)) {
            Product removedProduct = products.remove(productId);
            System.out.println("Product deleted: " + removedProduct);
        } else {
            System.out.println("Product not found: " + productId);
        }
    }

    public Product getProduct(String productId) {
        return products.get(productId);
    }

    public void displayAllProducts() {
        if (products.isEmpty()) {
            System.out.println("No products in inventory.");
        } else {
            System.out.println("Current Inventory:");
            for (Product product : products.values()) {
                System.out.println(product);
            }
        }
    }

    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Product product1 = new Product("P001", "Product 1", 100, 10.5);
        Product product2 = new Product("P002", "Product 2", 150, 20.75);
        inventory.addProduct(product1);
        inventory.addProduct(product2);
        inventory.displayAllProducts();
        Product updatedProduct1 = new Product("P001", "Updated Product 1", 120, 12.5);
        inventory.updateProduct(updatedProduct1);
        inventory.displayAllProducts();
        inventory.deleteProduct("P002");
        inventory.displayAllProducts();
    }
}
