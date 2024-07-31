package FactoryMethodPatternExample;


public class FactoryMethodTest {
 public static void main(String[] args) {
     DocumentFactory factory = new PdfDocumentFactory();
     Document doc = factory.createDocument();
     doc.open(); // Should print "Opening PDF document..."
 }
}
