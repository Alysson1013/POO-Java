/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatecfranca.provaex2;

import java.util.Date;

/**
 *
 * @author alyss
 */
public class TestaPedido {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date data = new Date();
        Cliente cl1 = new Cliente("1234312-5", "Jefinho");
        Unidade uni1 = new Unidade("Franca", "São Paulo");
        Pedido pd1 = new Pedido(1232132, data, cl1, uni1);
        System.out.println(pd1.toString());
        
        
        
    }
    
}
