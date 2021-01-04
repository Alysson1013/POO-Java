/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatecfranca.provaex3;

import java.util.ArrayList;

/**
 *
 * @author alyss
 */
public class Teste {

    /**
     * @param imovel
     */
    public static void mostra(Imovel imovel){
// polimorfismo
// quando imovel representa uma casa, executa toString da casa
// quando imovel representa um apto, executa toString do apto
    System.out.println(imovel.toString());
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Imovel> vetor = new ArrayList();
        
        
        vetor.add(new Casa(11.2f, "Japão")); 
        vetor.add(new Apto(13, "china"));
        mostra(vetor.get(0));
        mostra(vetor.get(1));
        
    }
    
}
