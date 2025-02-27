import flyweightFigures.Figura;
import flyweightFigures.FiguraFactory;

public class FigureRun {
    public static void main(String[] args) {
        Figura circulo1 = FiguraFactory.getFigura("circulo", "rojo");
        circulo1.dibujar(10, 20, 5);

        Figura cuadrado1 = FiguraFactory.getFigura("cuadrado", "verde");
        cuadrado1.dibujar(10, 20, 5);

        Figura rectangulo1 = FiguraFactory.getFigura("rectangulo", "azul");
        rectangulo1.dibujar(10, 20, 5, 10);

        Figura triangulo1 = FiguraFactory.getFigura("triangulo", "rojo");
        triangulo1.dibujar(10, 20, 5, 10, 15);

    }
}
