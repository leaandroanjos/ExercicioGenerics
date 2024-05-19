import java.util.ArrayList;
import java.util.List;

public class MetodosListaAbstract<T> {

    List<T> lista_veiculos;

    public MetodosListaAbstract(){
        List<T> lista_veiculos = new ArrayList<>();

        this.lista_veiculos = lista_veiculos;
    }

    public void adicionaElemento(T entidade){
        this.lista_veiculos.add(entidade);
    }

    public void lerLista(){

        for (int i = 0; i < lista_veiculos.size(); i++ ){

            System.out.println(lista_veiculos.get(i).toString());

        }
    }
}
