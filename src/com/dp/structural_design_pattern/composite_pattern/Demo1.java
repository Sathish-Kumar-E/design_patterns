package com.dp.structural_design_pattern.composite_pattern;

import java.util.List;
import java.util.ArrayList;


interface FileSystemComponent {
	public void showDetails();
}


class File implements FileSystemComponent {
	private String name;
	
	public File(String name) {
		this.name = name;
	}
	
	@Override
	public void showDetails() {
		System.out.println("File : " + name);
	}
}


class Folder implements FileSystemComponent {
	private String name;
	private List<FileSystemComponent> components = new ArrayList<>();
	
	public Folder(String name) {
		this.name = name;
	}
	
	public void addComponent(FileSystemComponent component) {
		components.add(component);
	}
	
	@Override
	public void showDetails() {
		System.out.println("Folder : " + name);
		for(FileSystemComponent component : components) {
			component.showDetails();
		}
	}
}


public class Demo1 {
	public static void main(String[] args) {
		Folder folder = new Folder("Documents");
		
		File file_01 = new File("File_01.txt");
		File file_02 = new File("File_02.txt");
		
		folder.addComponent(file_01);
		folder.addComponent(file_02);
		
		Folder subFolder = new Folder("Sub_Folder");
		
		File file_03 = new File("File_03.txt");
		
		subFolder.addComponent(file_03);
		
		folder.addComponent(subFolder);
		
		folder.showDetails();
	}
}

