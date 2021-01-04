/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatecfranca.funcionarios;

import java.util.ArrayList;

/**
 *
 * @author alyss
 */
public class testeFuncionarios {
    
    public static void mostraCalcula(Funcionario f){
        System.out.println(f.toString() + " Salário Final: " + f.calculaSalarioFinal());
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Criação de objetos
        ArrayList<Funcionario> vetor = new ArrayList();
        
        vetor.add(new Presidente(134.3f, "Naildon", "123456789", 5500)); 
        vetor.get(0).calculaSalarioFinal();
        mostraCalcula(vetor.get(0));
        
        vetor.add(new Diretor(20, "1234,-2", "Júlio", 3000));
        mostraCalcula(vetor.get(1));
        
        vetor.add(new Gerente(13.5f, "Carlos", "12345312-3", 4000));
        mostraCalcula(vetor.get(2));
    }
    
}
