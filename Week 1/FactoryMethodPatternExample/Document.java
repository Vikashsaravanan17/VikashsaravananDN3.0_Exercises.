package FactoryMethodPatternExample;



//Abstract Document class
abstract class Document {
 abstract void open();
}

//Concrete Document classes
class WordDocument extends Document {
 void open() {
     System.out.println("Opening Word document...");
 }
}

class PdfDocument extends Document {
 void open() {
     System.out.println("Opening PDF document...");
 }
}

class ExcelDocument extends Document {
 void open() {
     System.out.println("Opening Excel document...");
 }
}

//Abstract Factory class
abstract class DocumentFactory {
 abstract Document createDocument();
}

//Concrete Factory classes
class WordDocumentFactory extends DocumentFactory {
 Document createDocument() {
     return new WordDocument();
 }
}

class PdfDocumentFactory extends DocumentFactory {
 Document createDocument() {
     return new PdfDocument();
 }
}

class ExcelDocumentFactory extends DocumentFactory {
 Document createDocument() {
     return new ExcelDocument();
 }
}


