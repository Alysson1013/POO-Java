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
public class Animal {
    
    protected String nome;
    
    public String comer(){
        return "O animal " + this.nome + " está comendo.";
    };
    public String respirar(){
        return "O animal " + this.nome + " está respirando.";
    };

    public Animal() {
    }

    public Animal(String nome) {
        this.nome = nome;
    }
    
    
    
}
