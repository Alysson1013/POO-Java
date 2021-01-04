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
public class Pedra extends Elemento{


    Pedra() {
        
    }
    
    @Override
    public String quemSouEu(){
        return "Pedra";
    }
    
    @Override
    public void compara(Elemento elemento) {
       String quemE = elemento.quemSouEu();
        
        switch (quemE) {
            case "Papel" -> System.out.println("Pedra perde para Papel");
            case "Pedra" -> System.out.println("Pedra empata de Pedra");
            case "Tesoura" -> System.out.println("Pedra vence de Tesoura");
            default ->  System.out.println("Não é possível dizer quem venceu");
        }
    }
    
}
