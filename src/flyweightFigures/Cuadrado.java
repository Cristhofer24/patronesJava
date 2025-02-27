package flyweightFigures;

public class Cuadrado implements Figura {
    String color;

    public Cuadrado(String color) {
        this.color = color;
    }

    @Override
    public void dibujar(int x, int y, int... dimensiones) {
        int lado = dimensiones[0];
        System.out.println("Dibujando cuadrado de lado " + lado + " en la posición (" + x + ", " + y + ") con color " + color);
    }
}
