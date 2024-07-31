package ecommerce;

import java.util.Arrays;

public class SearchFunctions {
    public static Product linearSearch(Product[] products, String targetProductId) {
        for (Product product : products) {
            if (product.getProductId().equals(targetProductId)) {
                return product;
            }
        }
        return null; 
    }
    public static Product binarySearch(Product[] products, String targetProductId) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            Product midProduct = products[mid];

            int comparison = midProduct.getProductId().compareTo(targetProductId);

            if (comparison == 0) {
                return midProduct;
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product("P003", "Product 3", "Category A"),
            new Product("P001", "Product 1", "Category B"),
            new Product("P004", "Product 4", "Category C"),
            new Product("P002", "Product 2", "Category B")
        };
        Arrays.sort(products, (p1, p2) -> p1.getProductId().compareTo(p2.getProductId()));
        String searchId = "P002";
        Product foundProduct = linearSearch(products, searchId);
        System.out.println("Linear Search Result: " + (foundProduct != null ? foundProduct : "Product not found"));
        foundProduct = binarySearch(products, searchId);
        System.out.println("Binary Search Result: " + (foundProduct != null ? foundProduct : "Product not found"));
    }
}
