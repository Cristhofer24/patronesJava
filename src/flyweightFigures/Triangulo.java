package flyweightFigures;

public class Triangulo implements Figura{
    private String color;

    public Triangulo(String color) {
        this.color = color;
    }

    @Override
    public void dibujar(int x, int y, int... dimensiones) {
        int lado1 = dimensiones[0];
        int lado2 = dimensiones[1];
        int lado3 = dimensiones[2];
        System.out.println("Triangulo de color " + color + " en la posicion (" + x + "," + y + ") con lados (" + lado1 + "," + lado2 + "," + lado3 + ")");
    }
}
