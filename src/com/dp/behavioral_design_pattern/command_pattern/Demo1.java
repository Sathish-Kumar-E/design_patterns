package com.dp.behavioral_design_pattern.command_pattern;


// Command Interface
interface Command {
	void execute();
}


// Concrete Class - Bold Command
class BoldCommand implements Command {
	private TextEditor editor;
	
	public BoldCommand(TextEditor editor) {
		this.editor = editor;
	}
	
	@Override
	public void execute() {
		editor.boldText();
	}
}


// Concrete Class - Change Color
class ChangeColor implements Command {
	private TextEditor editor;
	
	public ChangeColor(TextEditor editor) {
		this.editor = editor;
	}
	
	@Override
	public void execute() {
		editor.changeColor();
	}
}


// Button Class
class Button {
	private Command command;
	
	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void click() {
		command.execute();
	}
}


// Receiver : TextEditor class
class TextEditor {
	public void boldText() {
		System.out.println("Text has been bolded.");
	}
	
	public void italicizeText() {
		System.out.println("Text has been italicized.");
	}
	
	public void underlineText() {
		System.out.println("Text has been underlined.");
	}
	
	public void changeColor() {
		System.out.println("Text color has been changed.");
	}
}


public class Demo1 {
	public static void main(String[] args) {
		TextEditor textEditor = new TextEditor();
		// Button, Decoupling -> One button can do many types of actions, decoupled from the text editor
		Button button = new Button();
		button.setCommand(new BoldCommand(textEditor));
		button.click();
		button.setCommand(new ChangeColor(textEditor));
		button.click();
	}
}
