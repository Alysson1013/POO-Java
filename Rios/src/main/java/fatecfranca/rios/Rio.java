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
public class Rio {
    
    //Atributos 
    public String nome;
    public float nivel;
    public boolean poluido;
    
    //Construtores
    
    //Construtor vazio
    public Rio(){
        
    }
    
    //Construtor 
    public Rio(String nome, float nivel, boolean poluido){
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
        
    }
    
   //Metodo de mostrar
   public void mostrar(){
       JOptionPane.showMessageDialog(null, "Nome: " + this.nome + "\nNível: " + this.nivel + "\nPoluido: " + this.poluido);
        
   }
   
   public void chover(float x){
       this.nivel = this.nivel + x;
   }
   
   public void ensolarar(float x){
       this.nivel = this.nivel - x;
   }
   
   public void limpar(){
       this.poluido = false;
   }
   
   public void sujar(){
       this.poluido = true;
   }
}
