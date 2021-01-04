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
public class Papel extends Elemento{
   
    @Override
    public String quemSouEu(){
        return "Papel";
    }
    @Override
    public void compara(Elemento elemento) {
        String quemE = elemento.quemSouEu();
        
        switch (quemE) {
            case "Papel" -> System.out.println("Papel empata com Papel");
            case "Pedra" -> System.out.println("Papel ganha de Pedra");
            case "Tesoura" -> System.out.println("Papel Perde para Tesoura");
            default ->  System.out.println("Não é possível dizer quem venceu");
        }
    }
}
