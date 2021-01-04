/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatecfranca.provaex2;

/**
 *
 * @author alyss
 */
public class Cliente {
    private String rg;
    private String nome;

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cliente() {
    }

    public Cliente(String rg, String nome) {
        this.rg = rg;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cliente{" + "rg=" + rg + ", nome=" + nome + '}';
    }
}
