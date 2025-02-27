import facadeCineCasa.*;

public class CineCasaRun {
    public  static void main(String[] args) {
        Televisor televisor = new Televisor();
        Altavoces altavoces = new Altavoces();
        VideoGame consola = new VideoGame();
        Reproductor reproductor = new Reproductor();

        CineCsa homeTheater = new CineCsa(televisor, altavoces, consola, reproductor);

        homeTheater.verMovie("El Señor de los Anillos");

        homeTheater.apagarSistema();




    }
}
