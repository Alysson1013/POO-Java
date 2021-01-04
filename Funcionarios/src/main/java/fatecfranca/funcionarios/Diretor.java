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
public final class Diretor extends Funcionario {
    
    //Atributos
    private float participacao;
    
    
    //Getters e Setters
    public float getParticipacao() {
        return participacao;
    }

    public void setParticipacao(float participacao) {
        this.participacao = participacao;
    }


    //Construtores
    public Diretor(float participacao, String nome, String cpf, float salario) {
        super(nome, cpf, salario);
        setParticipacao(participacao);
    }

    public Diretor() {
    }

    @Override
    public String toString() {
        return "Diretor{" + "participacao=" + participacao + super.toString() +"}";
    }
   
    @Override
    public float calculaSalarioFinal(){
        return super.calculaSalarioFinal() + (this.participacao * this.salario)/100;
    }
}
