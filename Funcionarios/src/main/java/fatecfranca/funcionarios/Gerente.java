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
public final class Gerente extends Funcionario {
    
    //Atributos
    private float bonus;

    
    //Getters e Setters
    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }
    
    //Construtores
    public Gerente() {
       
    }


    public Gerente(float bonus, String nome, String cpf, float salario) {
        super(nome, cpf, salario);
        setBonus(bonus);
    }
 
    //toString

    @Override
    public String toString() {
        return "Gerente{" + "bonus=" + bonus + super.toString() + '}';
    }

    @Override
    public float calculaSalarioFinal(){
        return super.calculaSalarioFinal() + this.bonus;
    }
       
}