/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatecfranca.provaex1;

/**
 *
 * @author alyss
 */
public class TestaComputador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Computador pc1 = new Computador(false, 8);
        System.out.println(pc1.toString());
        pc1.upgrade(24);
        pc1.onOff("Ligado");
        System.out.println(pc1.toString());
    }
    
}
