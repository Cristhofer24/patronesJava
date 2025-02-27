package aereopuertoMediator;

public class Avion {
    private String nombre;

    public Avion(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void solicitarAterrisaje(TorreControl torreControl){
        torreControl.solicitarAterrizaje(this);
    }

    public void aterrizar(){
        System.out.println(this.nombre + "Ha Aterrizado");
    }
}
