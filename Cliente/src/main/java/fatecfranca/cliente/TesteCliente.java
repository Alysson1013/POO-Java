/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatecfranca.cliente;

/**
 *
 * @author alyss
 */
public class TesteCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente cliente1 = new Cliente("Fulano", 2000, "1234-6", "123456-8");
        
        cliente1.showDate();
        cliente1.realizarDeposito(100);
        cliente1.realizarSaque(2100);
        cliente1.showDate();
        cliente1.setNumeroAgencia("1222-6");
        cliente1.showDate();
    }
    
}
