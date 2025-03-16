package com.dp.creational_pattern.factory_method_pattern;

// Abstract Product
interface Document {
	public void display();
}

// Concrete Product
class WordDocument implements Document {
	@Override
	public void display() {
		System.out.println("Displaying Word document");
	}
}

// Concrete Product
class PDFDocument implements Document {
	@Override
	public void display() {
		System.out.println("Displaying PDF document");
	}
}

// Creator
abstract class DocumentFactory {
	public abstract Document createDocument();
}

// Concrete Creator
class WordDocumentFactory extends DocumentFactory {
	@Override
	public Document createDocument() {
		return new WordDocument();
	}
}

// Concrete Creator
class PDFDocumentFactory extends DocumentFactory {
	@Override
	public Document createDocument() {
		return new PDFDocument();
	}
}

public class Demo4 {
	public static void main(String[] args) {
		DocumentFactory wordFactory = new WordDocumentFactory();
		Document wordDocument = wordFactory.createDocument();
		wordDocument.display();
		
		DocumentFactory pdfFactory = new PDFDocumentFactory();
		Document pdfDocument = pdfFactory.createDocument();
		pdfDocument.display();
	}
}
