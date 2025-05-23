package com.dp.behavioral_design_pattern.memento_pattern;

import java.util.Stack;

/*
 * A text editor where the user can undo changes such as text addition, deletion, or formatting.
 * The editor stores snapshots of its state (text content) after each change, enabling the user to revert to previous state.
 */
class TextEditor {
	private String content;
	
	public void write(String text) {
		this.content = text;
	}
	
	// Save the current state of the editor
	public EditorMemento save() {
		return new EditorMemento(this.content);
	}
	
	// Restore (Memento -> Update the state of current content)
	public void restore(EditorMemento memento) {
		this.content = memento.getContent();
	}
	
	public String getContent() {
		return this.content;
	}
}


// Mementor class : Stores the internal state of the TextEditor
class EditorMemento {
	private final String content;
	
	public EditorMemento(String content) {
		this.content = content;
	}
	
	public String getContent() {
		return this.content;
	}
}


// Caretaker class : Manage mementos (snapshots of the TextEditor state)
class Caretaker {
	private final Stack<EditorMemento> history = new Stack<>();
	
	public void saveState(TextEditor editor) {
		history.push(editor.save());
	}
	
	public void undo(TextEditor editor) {
		if(!history.isEmpty()) {
			history.pop();
			editor.restore(history.peek());
		}
	}
}


public class Demo1 {
	public static void main(String[] args) {
		TextEditor editor = new TextEditor();
		Caretaker caretaker = new Caretaker();
		
		editor.write("A");
		caretaker.saveState(editor);
		
		editor.write("B");
		caretaker.saveState(editor);
		
		editor.write("C");
		caretaker.saveState(editor);
		
		caretaker.undo(editor);
		
		System.out.println(editor.getContent());
	}
}
