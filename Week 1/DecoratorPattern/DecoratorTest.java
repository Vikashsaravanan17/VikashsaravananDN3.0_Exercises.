package DecoratorPattern;

public class DecoratorTest {
    public static void main(String[] args) {
        Notifier notifier = new EmailNotifier();
        notifier = new SMSNotifierDecorator(notifier);
        notifier.send("Hello World!"); // Should print sending email and SMS
    }
}