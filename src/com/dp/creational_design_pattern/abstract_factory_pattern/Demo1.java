package com.dp.creational_design_pattern.abstract_factory_pattern;


// Abstract Product Interface
interface Button {
	public void render();
}

interface ScrollBar {
	public void scroll();
}


// Windows UI Components
class WindowsButton implements Button {
	@Override
	public void render() {
		System.out.println("Rendering Windows Button");
	}
}

class WindowsScrollBar implements ScrollBar {
	@Override
	public void scroll() {
		System.out.println("Scrolling Windows ScrollBar");
	}
}


// MacOS UI Components
class MacOSButton implements Button {
	@Override
	public void render() {
		System.out.println("Rendering MacOS Button");
	}
}

class MacOSScrollBar implements ScrollBar {
	@Override
	public void scroll() {
		System.out.println("Scrolling MacOS ScrollBar");
	}
}


// Abstract Factory Interface
interface UIFactory {
	public Button createButton();
	public ScrollBar createScrollBar();
}


// Concrete Factory Implementations
class WindowsFactory implements UIFactory {
	@Override
	public Button createButton() {
		return new WindowsButton();
	}

	@Override
	public ScrollBar createScrollBar() {
		return new WindowsScrollBar();
	}
}


class MacOSFactory implements UIFactory {
	@Override
	public Button createButton() {
		return new MacOSButton();
	}

	@Override
	public ScrollBar createScrollBar() {
		return new MacOSScrollBar();
	}
}



// Application - Client
public class Demo1 {
	private Button button;
	private ScrollBar scrollBar;
	
	public Demo1(UIFactory factory) {
		this.button = factory.createButton();
		this.scrollBar = factory.createScrollBar();
	}
	
	public void renderUI() {
		button.render();
		scrollBar.scroll();
	}
	
	public static void main(String[] args) {
		// Use Windows UI
		Demo1 app = new Demo1(new WindowsFactory()); // We can easily switch between Windows and MacOS easily supplying correct factory
													 // Related components are grouped together - It is not possible to have WindowsButton MacOSScrollBar
		app.renderUI();
	}
}

