package flyweightFigures;

public class Circulo implements Figura{
    private String color;

    public Circulo(String color) {
        this.color = color;
    }

    @Override
    public void dibujar(int x, int y, int... dimensiones) {
        int radio = dimensiones[0];
        System.out.println("Dibujando un circulo de color " + color + " en la posición (" + x + ", " + y + ") con radio " + radio);

    }
}
