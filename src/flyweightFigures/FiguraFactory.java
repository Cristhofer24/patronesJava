package flyweightFigures;

import java.util.HashMap;
import java.util.Map;

public class FiguraFactory {
    private static final Map<String, Figura> figuras = new HashMap<>();

    public static Figura getFigura(String tipo, String color) {
        String key = tipo + "-" + color;

        if (!figuras.containsKey(key)) {
            System.out.println("Creando " + tipo + " de color " + color);
            switch (tipo.toLowerCase()) {
                case "circulo":
                    figuras.put(key, new Circulo(color));
                    break;
                case "cuadrado":
                    figuras.put(key, new Cuadrado(color));
                    break;
                case "rectangulo":
                    figuras.put(key, new Rectangulo(color));
                    break;
                case "triangulo":
                    figuras.put(key, new Triangulo(color));
                    break;
                default:
                    throw new IllegalArgumentException("Tipo de figura no reconocido");
            }
        } else {
            System.out.println("Reutilizando " + tipo + " de color " + color);
        }
        return figuras.get(key);
    }
}
