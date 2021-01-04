/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatecfranca.interfaceex;

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
        Pessoa pessoa1 = new Pessoa("Lulindo", "São Suzano", "", "", "Gelso", "POO");
        pessoa1.tiraCpf();
        pessoa1.tiraRg();
        pessoa1.vota();
        System.out.println(pessoa1.toString());
        
    }
    
}
