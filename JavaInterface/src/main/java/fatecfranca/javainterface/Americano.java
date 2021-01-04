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
public class Americano implements ICidadao, ISocial{
    private boolean votou;
    private float salario;
    private String eventoFav;
    
    @Override
    public String votar(){
        return votou?"Optou por votar!!!":"Não votou!";
    }
    
    @Override
    public String pagarImposto(){
        return "Pagou 40% de imposto sobre seu salário" + this.salario;
    }

    public Americano() {
    }

    public Americano(boolean votou, float salario, String eventoFav) {
        this.votou = votou;
        this.salario = salario;
        this.eventoFav = eventoFav;
    }
    
    @Override
    public String comemorando(){
        return "Comemorou no " + this.eventoFav;
    };
    
    @Override
    public String seDivertindo(){
        return "Se divertiu batendo em nazista";
    };
    
}
