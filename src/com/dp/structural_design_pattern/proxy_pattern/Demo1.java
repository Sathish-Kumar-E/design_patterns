package com.dp.structural_design_pattern.proxy_pattern;


interface Image {
	public void display();
}


class RealImage implements Image {
	private String filename;
	
	public RealImage(String filename) {
		this.filename = filename;
	}
	
	public void loadImageFromDisk() {
		System.out.println("Loading image from disk : " + filename);
	}
	
	@Override
	public void display() {
		System.out.println("Displaying : " + filename);
	}
}


class ProxyImage implements Image {
	private String filename;
	private RealImage realImage; // Proxy reference to Real Image
	
	public ProxyImage(String filename) {
		this.filename = filename;
	}
	
	@Override
	public void display() {
		if(realImage == null) {
			realImage = new RealImage(filename); // Image is loaded and cached
		}
		realImage.display();
	}
}


public class Demo1 {
	public static void main(String[] args) {
		Image image_01 = new ProxyImage("dog.png");
		Image image_02 = new ProxyImage("cat.png");
		// The image is loaded lazily when needed, saving time and resources if the image is never displayed
		image_01.display(); // Create RealImage + Load + Display
		image_02.display(); // Display RealImage
	}
}

