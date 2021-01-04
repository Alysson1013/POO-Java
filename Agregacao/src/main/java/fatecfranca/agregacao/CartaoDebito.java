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
public class CartaoDebito {

    private String numero;
    private String bandeira;
    private int senha;
    private String validade;
    private ContaCorrente conta;

    public String getNumero() {
        return numero;
    }

    public String getBandeira() {
        return bandeira;
    }

    public int getSenha() {
        return senha;
    }

    public String getValidade() {
        return validade;
    }

    public ContaCorrente getConta() {
        return conta;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public void setConta(ContaCorrente conta) {
        this.conta = conta;
    }

    public CartaoDebito() {
    }

    public CartaoDebito(String numero, String bandeira, int senha, String validade, ContaCorrente conta) {
        this.numero = numero;
        this.bandeira = bandeira;
        this.senha = senha;
        this.validade = validade;
        this.conta = conta;
    }

    public void fazerCompra(String produto, float preco, int senha, String data) {
        int mesCompra = Integer.parseInt(data.split("/")[0]);
        int anoCompra = Integer.parseInt(data.split("/")[1]);
        
        int mesValidade = Integer.parseInt(this.validade.split("/")[0]);
        int anoValidade = Integer.parseInt(this.validade.split("/")[1]);
        
        
        if ((anoCompra <= anoValidade) && (mesCompra <= mesValidade)) {
            if (this.senha == senha) {
                if (this.conta.getSaldo() > preco) {
                    this.conta.setSaldo((this.conta.getSaldo() - preco));
                    System.out.println("Compra Efetuada com sucesso!");
                } else {
                    System.out.println("Saldo Insuficiente");
                }
            } else {
                System.out.println("Senha Inválida");
            }
        } else {
            System.out.println("Cartão Vencido");
        }
    }

    @Override
    public String toString() {
        return "CartaoDebito{" + "numero=" + numero + ", bandeira=" + bandeira + ", senha=" + senha + ", validade=" + validade + ", conta=" + conta.toString() + '}';
    }

}
