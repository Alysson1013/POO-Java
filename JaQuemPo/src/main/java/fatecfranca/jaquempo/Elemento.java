/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatecfranca.jaquempo;

/**
 *
 * @author alyss
 */
public abstract class Elemento {
    
    public Elemento(){}

    public String quemSouEu(){
        return "Elemento";
    }
    
    //metodo apenas definido não implementado
    //Implementação apenas nas classes filhas
    public abstract void compara(Elemento elemento);
}
