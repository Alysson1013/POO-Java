/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatecfranca.interfaceex;

/**
 *
 * @author alyss
 */
public class Pessoa extends Animal implements Cidadao, Contribuinte, Professor{
    
    private String Candidato;
    private String LocalT;
    private String cpf;
    private String rg;  
    private String materia;

    public Pessoa() {
    }


    public Pessoa(String Candidato, String LocalT, String cpf, String rg, String nome, String materia) {
        super(nome);
        this.Candidato = Candidato;
        this.LocalT = LocalT;
        this.cpf = cpf;
        this.rg = rg;
        this.materia = materia;
    }
    
    
    
    @Override
    public String vota() {
        return this.nome + " votou em " + this.Candidato;
    }

    @Override
    public String tiraRg() {
        this.rg = "321232132";
        return this.rg;
    }

    @Override
    public String pagarIR() {
        return "Pagou 40% de imposto.";
    }

    @Override
    public String tiraCpf() {
        this.cpf = "3243123213";
        return this.cpf;
    }

    @Override
    public String trabalha() {
        return this.nome + " está dando aula em " + this.LocalT;
     }

    @Override
    public String ensina() {
        return "Está dando Aula de " + this.materia;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "Candidato=" + Candidato + ", LocalT=" + LocalT + ", cpf=" + cpf + ", rg=" + rg + ", materia=" + materia + '}';
    }
    
    
}
