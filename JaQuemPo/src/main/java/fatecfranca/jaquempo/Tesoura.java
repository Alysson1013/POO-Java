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
public class Tesoura extends Elemento {
    @Override
    public String quemSouEu(){
        return "Tesoura";
    }
    
    @Override
    public void compara(Elemento elemento) {
       String quemE = elemento.quemSouEu();
        
        switch (quemE) {
            case "Papel" -> System.out.println("Tesoura Vence de Papel");
            case "Pedra" -> System.out.println("Tesoura perde para Pedra");
            case "Tesoura" -> System.out.println("Tesoura empata com Tesoura");
            default ->  System.out.println("Não é possível dizer quem venceu");
        }
    }
}
