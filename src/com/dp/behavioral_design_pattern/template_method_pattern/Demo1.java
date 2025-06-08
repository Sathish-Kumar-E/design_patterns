package com.dp.behavioral_design_pattern.template_method_pattern;


abstract class DataParser {
	// Template Method - Define the steps of the algorithm
	public final void parse() {
		openFile();
		parseData();
		closeFile();
	}
	
	protected void openFile() {
		System.out.println("Opening File");
	}
	
	protected void closeFile() {
		System.out.println("Closing File");
	}
	
	protected abstract void parseData();
}


// Concrete Subclass : CSV Parser
class CSVParser extends DataParser {
	@Override
	protected void parseData() {
		System.out.println("Parsing CSV Data");
	}
}


// Concrete Subclass : JSON Parser
class JSONParser extends DataParser {
	@Override
	protected void parseData() {
		System.out.println("Parsing JSON Data");
	}
}



public class Demo1 {
	public static void main(String[] args) {
		DataParser csvParser = new CSVParser();
		DataParser jsonParser = new JSONParser();
		csvParser.parse();
		System.out.println();
		jsonParser.parse();
	}
}

