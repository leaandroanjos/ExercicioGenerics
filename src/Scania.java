public class Scania extends CaminhaoAbstract {

    private String capacidade;

    private String cor;

    private Integer numero_de_assentos;

    @Override
    public void setCapacidade(String capacidade) {
        this.capacidade = capacidade;
    }

    @Override
    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public void setNumero_de_assentos(Integer numero_de_assentos) {
        this.numero_de_assentos = numero_de_assentos;
    }

    @Override
    public String toString() {
        return "Scania{" +
                "capacidade='" + capacidade + '\'' +
                ", cor='" + cor + '\'' +
                ", numero_de_assentos=" + numero_de_assentos +
                '}';
    }
}
