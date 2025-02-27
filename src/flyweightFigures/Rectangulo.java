package flyweightFigures;

public class Rectangulo implements Figura {
    String color;

    public Rectangulo(String color) {
        this.color = color;
    }

    @Override
    public void dibujar(int x, int y, int... dimensiones) {
        int lado1 = dimensiones[0];
        int lado2 = dimensiones[1];
        System.out.println("Dibujando un rectangulo de color " + color + " en las coordenadas (" + x + ", " + y + ") con lados de " + lado1 + " y " + lado2);
    }
}
