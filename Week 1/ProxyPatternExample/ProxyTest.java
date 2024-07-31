package ProxyPatternExample;

public class ProxyTest {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_image.jpg");
        image.display(); // Should load and display the image
        image.display(); // Should only display the image
    }
}