package textCommand;

public class AgregarTexto implements Command{
    private Editor editor;
    private String text;

    public AgregarTexto(Editor editor, String text) {
        this.editor = editor;
        this.text = text;
    }

    @Override
    public void ejecutar() {
        this.editor.agregarTexto(this.text);

    }

    @Override
    public void deshacer() {
        this.editor.eliminarTexto(this.text);

    }
}
