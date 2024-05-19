public class Civic extends CarroAbstract {

        private String roda;

        private String cor;

        private String nome;

    @Override
    public void setRoda(String roda) {
        this.roda = roda;
    }

    @Override
    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Civic{" +
                "roda='" + roda + '\'' +
                ", cor='" + cor + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
