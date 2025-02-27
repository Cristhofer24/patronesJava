import aereopuertoMediator.Avion;
import aereopuertoMediator.TorreControl;

public class AvionRun {
    public  static void main(String[] args) {
        TorreControl tc =  new TorreControl();

        Avion av1 = new Avion("Latam");
        Avion av2 = new Avion("Falcon");

        av1.solicitarAterrisaje(tc);
        av2.solicitarAterrisaje(tc);

        tc.finAterrizaje();


    }
}
