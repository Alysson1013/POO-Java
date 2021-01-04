package fatecfranca.agregacaoarray;

public class Disciplina {
    private String sigla;
    private String nome;
    private int creditos;

    public Disciplina() {
    }

    public Disciplina(String sigla, String nome, int creditos) {
        this.sigla = sigla;
        this.nome = nome;
        this.creditos = creditos;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    @Override
    public String toString() {
        return "Disciplina{" + "sigla=" + sigla + ", nome=" + nome + ", creditos=" + creditos + '}';
    }
    
}
