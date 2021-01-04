/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatecfranca.funcionarios;

/**
 *
 * @author alyss
 */
public class Funcionario {
    protected  String nome;
    protected String cpf;
    protected float salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    

    public Funcionario(String nome, String cpf, float salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public Funcionario() {
    }

    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", cpf=" + cpf + ", salario=" + salario + '}';
    }
    
    public float calculaSalarioFinal(){
        return this.salario;
    }
    
}
