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
public class Presidente extends Funcionario{
    //atributos
    private float acoes;
    
    //Getters e Setters

    public float getAcoes() {
        return acoes;
    }

    public void setAcoes(float acoes) {
        this.acoes = acoes;
    }
    
    //construtores

    public Presidente() {
    }

    public Presidente(float acoes, String nome, String cpf, float salario) {
        super(nome, cpf, salario);
        this.acoes = acoes;
    }

    public Presidente(float acoes) {
        this.acoes = acoes;
    }
    
    //toString()

    @Override
    public String toString() {
        return "Presidente{" + "acoes=" + acoes + super.toString() + '}';
    }
    
    @Override
    public float calculaSalarioFinal(){
        return super.calculaSalarioFinal() + (this.acoes * 10);
    }
    
}
