/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatecfranca.exerciciovoos;

/**
 *
 * @author alyss
 */
public final class Passageiro {
    private String cpf;
    private String nome;

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Passageiro(String cpf, String nome) {
        setCpf(cpf);
        setNome(nome);
    }
    
    public Passageiro(){}
    
    @Override
    public String toString(){
        return "Nome: " + getNome() + " CPF " + getCpf();
    }

    
    
}
