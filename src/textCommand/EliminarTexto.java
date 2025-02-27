package textCommand;

public class EliminarTexto implements Command {
    private Editor editor;
    private String text;

    public EliminarTexto(Editor editor, String text) {
        this.editor = editor;
        this.text = text;
    }

    @Override
    public void ejecutar() {
        this.editor.eliminarTexto(this.text);

    }

    @Override
    public void deshacer() {
        this.editor.agregarTexto(this.text);

    }
}
