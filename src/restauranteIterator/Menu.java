package restauranteIterator;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<ListaMenu> lista;

    public Menu() {
        this.lista = new ArrayList<>();
    }

    public void agregarLista(ListaMenu lista){
        this.lista.add(lista);
    }

    public MenuIterator iterator(){
        return new MenuIterator(this.lista);
    }
}
