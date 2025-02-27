package textCommand;

public class Editor {
    private String text;

    public Editor() {
        this.text="";
    }

    public void agregarTexto(String text){
        this.text += text;
        System.out.println("Texto Actual" +  this.text);
    }

    public void eliminarTexto(String text){
        if (this.text.contains(text)){
            this.text = this.text.replace(text,"");
            System.out.println("Texto Actual: "+this.text);
        }else {
            System.out.println("El texto a eliminar no se encuntra disponible");
        }
    }
}
