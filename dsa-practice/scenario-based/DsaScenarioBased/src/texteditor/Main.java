package texteditor;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        editor.insert("Hello");
        editor.insert(" World");
        editor.show();   // Hello World

        editor.undo();
        editor.show();   // Hello

        editor.redo();
        editor.show();   // Hello World

        editor.delete(6);
        editor.show();   // Hello

        editor.undo();
        editor.show();   // Hello World
    }
}
