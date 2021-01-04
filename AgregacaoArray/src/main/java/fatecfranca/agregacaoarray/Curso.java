package fatecfranca.agregacaoarray;
import java.util.ArrayList;

public class Curso {
    private int codigo;
    private String nome;
    private String area;
    // Agregação com ArrayList(vetor)
    private ArrayList<Disciplina> disciplinas;

    public Curso() {
    }

    public Curso(int codigo, String nome, String area, ArrayList<Disciplina> disciplinas) {
        this.codigo = codigo;
        this.nome = nome;
        this.area = area;
        this.disciplinas = disciplinas;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getArea() {
        return area;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    @Override
    public String toString() {
        // quando executa disciplinas.toString(), automaticamente vai executar o toString() de todas as 
        // disciplinas que fazem parte do curso.
        return "Curso{" + "codigo=" + codigo + ", nome=" + nome + ", area=" + area + ", disciplinas=" + disciplinas.toString() + '}';
    }
    
    // Create - CRUD
    public void adicionaDisciplina(Disciplina disciplina) {
        // vamos utilizar o método add to ArrayList
        this.disciplinas.add(disciplina);
    }
    
    // Delete - CRUD
    public boolean removeDisciplina(Disciplina disciplina) {
        // vamos utilizar o método remove
        // retorna true se consegue remover e falso caso contrário
        return this.disciplinas.remove(disciplina);
    }
    
    // Retrieve - CRUD
    // retorna a posição da disciplina no vetor, retorna -1 se não encontrar
    public int recuperaDisciplina(Disciplina disciplina) {
        // vamos utilizar o método indexOf
        return this.disciplinas.indexOf(disciplina);
    }
    
    // Update - CRUD
    public boolean atualizarDisciplina(Disciplina atual, Disciplina nova) {
        // verifica se a disciplina atual existe
        int pos = this.recuperaDisciplina(atual);
        if(pos != -1) { // existe
            // atualiza com o método set
            this.disciplinas.set(pos, nova);
            return true;
        }
        else {
            return false;
        }  
    }
}
