/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatecfranca.rios;

import javax.swing.JOptionPane;

/**
 *
 * @author alyss
 */
public class riosMain {
    public static void main(String args[]){
        
        Rio rio1 = new Rio("Francisco", 13, false);
        
        rio1.mostrar();
        rio1.chover(2);
        rio1.ensolarar(3);
        rio1.sujar();
        rio1.mostrar();
        
        String a = JOptionPane.showInputDialog("Digite o nome do Rio");
        float b = Float.parseFloat(JOptionPane.showInputDialog("Informe o nivel"));
        boolean c = Boolean.parseBoolean(JOptionPane.showInputDialog("Está poluido?"));
        
        Rio rio3 = new Rio(a, b, c);
        
        rio3.mostrar();
    }
}
