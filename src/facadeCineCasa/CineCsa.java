package facadeCineCasa;

public class CineCsa {
    private Televisor televisor;
    private Altavoces altavoces;
    private VideoGame videoGame;
    private Reproductor reproductor;

    public CineCsa(Televisor televisor, Altavoces altavoces, VideoGame videoGame, Reproductor reproductor) {
        this.televisor = televisor;
        this.altavoces = altavoces;
        this.videoGame = videoGame;
        this.reproductor = reproductor;
    }

    public void verMovie(String pelicula){
        System.out.println("\n🎥 Preparando sistema de Cine en Casa...\n");
        televisor.encender();
        altavoces.encender();
        altavoces.volumen(50);
        videoGame.encender();
        reproductor.encender();
        reproductor.reproducir(pelicula);
        System.out.println("\n🍿 ¡Disfruta la película! 🎬\n");
    }

    public void apagarSistema() {
        System.out.println("\n🔌 Apagando sistema de Cine en Casa...\n");
        reproductor.apagar();
        videoGame.apagar();
        altavoces.apagar();
        televisor.apagar();
        System.out.println("\n🎬 Sistema apagado. ¡Hasta la próxima!\n");
    }

}
