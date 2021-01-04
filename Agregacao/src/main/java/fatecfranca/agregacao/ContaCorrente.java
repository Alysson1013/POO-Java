/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatecfranca.agregacao;

/**
 *
 * @author alyss
 */
public class ContaCorrente {
    private String nroAgencia;
    private String nroConta;
    private String nome;
    private float saldo;

    public String getNroAgencia() {
        return nroAgencia;
    }

    public void setNroAgencia(String nroAgencia) {
        this.nroAgencia = nroAgencia;
    }

    public String getNroConta() {
        return nroConta;
    }

    public void setNroConta(String nroConta) {
        this.nroConta = nroConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public ContaCorrente() {
        
    }

    public ContaCorrente(String nroAgencia, String nroConta, String nome, float saldo) {
        this.nroAgencia = nroAgencia;
        this.nroConta = nroConta;
        this.nome = nome;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" + "nroAgencia=" + nroAgencia + ", nroConta=" + nroConta + ", nome=" + nome + ", saldo=" + saldo + '}';
    }
    
    
}
