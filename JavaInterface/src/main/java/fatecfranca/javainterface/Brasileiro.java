/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatecfranca.javainterface;

/**
 *
 * @author alyss
 */
public class Brasileiro implements ICidadao, ISocial {
    public String time;
    public float salario;
    public String escola;
    
    @Override 
    public String votar(){
        return "Brasileiro Votou na Escola!!!";
    }
            
    @Override 
    public String pagarImposto(){
        return "Brasileiro pagou 27.4% de imposto sobre seu salário" + this.salario;
    }
    
    @Override
    public String comemorando(){
        return "Comemorou no jogo do" + this.time;
    };
    
    @Override
    public String seDivertindo(){
        return "Se divertindo no Churrasco";
    };

    public Brasileiro() {
    }

    public Brasileiro(float salario, String escola, String time) {
        this.salario = salario;
        this.escola = escola;
        this.time = time;
    }
    
    
}
