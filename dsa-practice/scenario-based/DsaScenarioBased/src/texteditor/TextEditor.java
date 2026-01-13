package texteditor;

import java.util.Stack;

class TextEditor{
	 String text = "";
	    Stack<String> undo = new Stack<>();
	    Stack<String> redo = new Stack<>();

	    // Insert text
	    void insert(String newText) {
	        undo.push(text);
	        text += newText;
	        redo.clear();
	    }

	    // Delete last n characters
	    void delete(int n) {
	        undo.push(text);
	        text = text.substring(0, text.length() - n);
	        redo.clear();
	    }

	    // Undo	
	    void undo() {
	        if (!undo.isEmpty()) {
	            redo.push(text);
	            text = undo.pop();
	        }
	    }

	    // Redo
	    void redo() {
	        if (!redo.isEmpty()) {
	            undo.push(text);
	            text = redo.pop();
	        }
	    }

	    void show() {
	        System.out.println(text);
	    }
}