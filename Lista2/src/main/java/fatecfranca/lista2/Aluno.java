/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatecfranca.lista2;

/**
 *
 * @author alyss
 */
public class Aluno {
    private int ra;
    private String nome;
    private String rg;
    private int idade;
    private float nota;
    
    //Construtores
    Aluno(){
        
    }
    
    Aluno(int ra, String nome, String rg, int idade, float nota){
        this.ra = ra;
        this.nome = nome;
        this.rg = rg;
        this.idade = idade;
        this.nota = nota;
    }
    
    //Getter e Setter
        
    //Getter do RA
    public int getRa(){
        return this.ra;
    }
    
    //Setter do RA
    public void setRa(int ra){
        if (ra > 0){
            this.ra = ra;
        } else {
            System.out.println("Usuário, o RA em questão é inválido");
        }
    }
    
    //Getter do nome
    public String getNome(){
        return this.nome;
    }
    
    //Getter do RG
    public String getRg(){
        return this.rg;
    }
    
    //Setter do Rg
    public void setRg(String rg){
        if(rg.charAt(10) == '-'){
            this.rg = rg;
        }
    }
    
    //Getter da Idade
    public int getIdade(){
        return this.idade;
    }
    
    //Setter da idade
    public void setIdade(int idade){
        if (idade > 0){
            this.idade = idade;
        } else {
            System.out.println("Usuário, a idade em questão é inválida");
        }
    }
    
    //Getter do nota
    public float getNota(){
        return this.nota;
    }
    
    //setter da nota
    public void setNota(float nota){
        if(nota > 0 && nota <= 10){
            this.nota = nota;
        } else {
            System.out.println("Usuário, o RA em questão é inválido");
        }
    }
}
