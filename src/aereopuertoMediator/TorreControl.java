package aereopuertoMediator;

import java.util.LinkedList;
import java.util.Queue;

public class TorreControl {
    private boolean aterrisajeProgreso;
    private Queue<Avion> avionEspera;

    public TorreControl(){
        this.aterrisajeProgreso=false;
        this.avionEspera = new LinkedList<>();

    }

    public void solicitarAterrizaje(Avion avion) {
        if (!aterrisajeProgreso) {
            System.out.println(avion.getNombre() + " ha recibido permiso para aterrizar.");
            aterrisajeProgreso = true;
            avion.aterrizar();
        } else {
            System.out.println(avion.getNombre() + " debe esperar, el aterrizaje está en curso.");
            avionEspera.add(avion);
        }
    }

    public void finAterrizaje() {
        System.out.println("Aterrizaje completado, La torre de control está disponible para otros aviones.");
        aterrisajeProgreso = false;

        if (!avionEspera.isEmpty()) {
            Avion siguienteAvion = avionEspera.poll();
            solicitarAterrizaje(siguienteAvion);
        }
    }



}
