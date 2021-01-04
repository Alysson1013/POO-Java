/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatecfranca.exerciciovoos;

/**
 *
 * @author alyss
 */
public class TesteReserva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Passageiro p1 = new Passageiro("231235412", "Paulo");
        Voo voo1 = new Voo(123, "Vegas", "Brasil");
        
        Reserva r1 = new Reserva("1234", "11/06/2001", voo1, p1);
        
        System.out.println(r1.toString());
    }
    
}
