/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatecfranca.jaquempo;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author alyss
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String escolhaUsuario = JOptionPane.showInputDialog("1. Pedra, 2. Tesoura, 3. Papel");
        Elemento usuario;
        
        switch(escolhaUsuario){
            case "1" -> usuario = new Pedra();
            case "2" -> usuario = new Tesoura();
            case "3" -> usuario = new Papel();
            default -> usuario = null;
        }
        
        Random random = new Random();
        int escolhaPc = random.nextInt(3);
        Elemento pc;
        switch(escolhaPc){
            case 0 -> pc = new Pedra();
            case 1 -> pc = new Tesoura();
            case 2 -> pc = new Papel();
            default -> pc = null;
            
        }
        
        if ((usuario != null) && (pc != null)){
            usuario.compara(pc);
        } else {
            System.out.println("Algo deu errado");
        }
    }

    
}
