/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatecfranca.agregacao;

/**
 *
 * @author alyss
 */
public class TestaCartao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ContaCorrente cc1 = new ContaCorrente("123", "123456", "José", 3000);
        
        CartaoDebito cd1 = new CartaoDebito("123456", "visa", 1234, "12/2021", cc1);
        System.out.println(cc1.toString());
        cd1.fazerCompra("carro", 150, 1234, "12/2020");
        cd1.fazerCompra("carro", 1500, 1234, "12/2020");
        cd1.fazerCompra("carro", 120, 1234, "12/2020");
        System.out.println(cd1.toString());
        System.out.println(cc1.toString());

    }
    
}
