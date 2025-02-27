import restauranteIterator.ListaMenu;
import restauranteIterator.Menu;
import restauranteIterator.MenuIterator;

public class RestauranteRun {
    public static void main(String[] args) {
        ListaMenu l1 = new ListaMenu("Pollo",20);
        ListaMenu l2 = new ListaMenu("Pizaa",15);
        ListaMenu l3 = new ListaMenu("Hamburgesa",10);

        Menu menu = new Menu();
        menu.agregarLista(l1);
        menu.agregarLista(l2);
        menu.agregarLista(l3);

        System.out.println("Menu de comuda:");
        MenuIterator iterator = menu.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
