/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatecfranca.provaex3;

/**
 *
 * @author alyss
 */
public class Imovel {
    protected String endereco;

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Imovel() {
    }

    public Imovel(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Imovel{" + " endereco= " + endereco + '}';
    }
}
