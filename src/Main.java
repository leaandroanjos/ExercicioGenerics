// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {

        MetodosListaAbstract lista = new MetodosListaAbstract();
        Civic civic = new Civic();
        civic.setRoda("Liga leve");
        civic.setCor("Azul Metálico");
        civic.setNome("Civic 2017");

        Scania scania = new Scania();
        scania.setCor("Prata");
        scania.setCapacidade("7000 Litros");
        scania.setNumero_de_assentos(3);

        lista.adicionaElemento(civic);
        lista.adicionaElemento(scania);

        lista.lerLista();

    }

}