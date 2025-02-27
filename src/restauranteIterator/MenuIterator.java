package restauranteIterator;

import java.util.Iterator;
import java.util.List;

public class MenuIterator implements Iterator<ListaMenu> {
    private List<ListaMenu> lista;
    private int indice;

    public MenuIterator(List<ListaMenu> lista) {
        this.lista = lista;
        this.indice =0;
    }

    @Override
    public boolean hasNext() {
        return indice < lista.size();
    }

    @Override
    public ListaMenu next() {
        if(hasNext()){
            ListaMenu item = lista.get(indice);
            indice++;
            return item;
        }

        throw new IndexOutOfBoundsException("No more items in the menu");
    }
}
