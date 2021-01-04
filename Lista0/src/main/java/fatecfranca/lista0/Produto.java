/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Pacotes de classes, para organiza-las, como um diretório
package fatecfranca.lista0;

/**
 *
 * @author alyss
 */

//Definição da Classe
public class Produto {
      
    //Declaração de Variaveis
    public String nome; //String declarado com letra maiscula pois é uma classe em Java
    public float preco;
    public int qtde;
    
    
    //Necessário para criar objeto vazio
    public Produto(){
    
    }
    
    public Produto(String nome, float preco, int qtde){
        this.nome = nome;
        this.preco = preco;
        this.qtde = qtde;
    }
    
    //Método para comprar um produto
    public void comprar(int x){
        this.qtde = this.qtde + x;
    }
    
    public void vender(int x){
        this.qtde = this.qtde - x;
    }
    
    public void aumentarPreco(float x){
        this.preco = this.preco + x;
    }
    
    public void diminuirPreco(float x){
        this.preco = this.preco - x;
    }
    
    public void mostrar(){
         System.out.println("Nome: " + this.nome + " Preço: " + this.preco + " Quantidade: " + this.qtde);
    }
}
