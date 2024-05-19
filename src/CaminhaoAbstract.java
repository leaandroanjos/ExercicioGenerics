public abstract class CaminhaoAbstract {

    private String capacidade;

    private String cor;

    private Integer numero_de_assentos;

    public String getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(String capacidade) {
        this.capacidade = capacidade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getNumero_de_assentos() {
        return numero_de_assentos;
    }

    public void setNumero_de_assentos(Integer numero_de_assentos) {
        this.numero_de_assentos = numero_de_assentos;
    }
}
