import textCommand.*;

public class TextRun {
    public static void main(String[] args) {
        Editor ed = new Editor();
        EditorControl edc = new EditorControl();

        Command addCommand = new AgregarTexto(ed,"El Perro es bonito");
        Command deleteCommand = new EliminarTexto(ed,"Bonito");

        edc.ejecutarComandos(addCommand);
        edc.ejecutarComandos(deleteCommand);

        edc.deshacer();
        edc.deshacer();

    }
}
