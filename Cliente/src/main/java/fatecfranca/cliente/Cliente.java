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
public class Cliente {
    private String numeroConta;
    private String numeroAgencia;
    private String nome;
    private float saldo;
    
    //Getters
    public String getNumeroConta(){
        return this.numeroConta;
    }
    
    public String numeroAgencia(){
        return this.numeroAgencia;
    }
    
    public String nome(){
        return this.nome;
    }
    
    public float saldo(){
        return this.saldo;
    }
    
    //Setters
    
    public final void setNumeroConta(String numeroConta){
        if (numeroConta.length() == 8 && numeroConta.charAt(6) == '-'){
            this.numeroConta = numeroConta;
        } else {
            this.numeroConta = "0";
            System.out.println("ERRO!!!");
        }
    }
    
    public final void setNumeroAgencia(String numeroAgencia){
        if (numeroAgencia.length() == 6 && numeroAgencia.charAt(4) == '-'){
            this.numeroAgencia = numeroAgencia;
        } else {
            this.numeroAgencia = "0";
            System.out.println("ERRO!!!");
        }
    }
    
    public final void setNome(String nome){
        if (nome.length() > 0 && nome.length() <= 30){
            this.nome = nome;
        } else {
            this.nome = "Cliente";
            System.out.println("ERRO!!!");
        }
    }
    
    public final void setSaldo(float saldo){
        if (saldo > 0){
            this.saldo = saldo;
        } else {
            this.saldo = 0;
            System.out.println("ERRO!!!");
        }
    }
    
    //Métodos
    
    public void realizarDeposito(float x){
        this.saldo = this.saldo + x;
    }
    
    public void realizarSaque(float x){
        if (x > this.saldo){
            System.out.println("O valor não pode ser Negativo");
        } else if(this.saldo > 0){
            this.saldo = this.saldo - x;
        }
        
    }
    
    //Exibir dados
    public void showDate(){
        System.out.println("Nome: " + this.nome +  " Saldo: " + this.saldo + " Numero da Conta: " + this.numeroConta + " Número Agencia: " + this.numeroAgencia);
    }
    
    //Construtores
    
    //Construtor Default
    public Cliente(){
        
    }
    
    //Costrutor Padrão
    public Cliente(String nome, float saldo, String numeroAgencia, String numeroConta){
        setNome(nome);
        setSaldo(saldo);
        setNumeroAgencia(numeroAgencia);
        setNumeroConta(numeroConta);
    }
    
}
