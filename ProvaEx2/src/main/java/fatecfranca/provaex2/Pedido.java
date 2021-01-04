/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatecfranca.provaex2;

import java.util.Date;

/**
 *
 * @author alyss
 */
public class Pedido {
    private int codigo;
    private Date data;
    private Cliente Cliente;
    private Unidade Unidade;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return Cliente;
    }

    public void setCliente(Cliente Cliente) {
        this.Cliente = Cliente;
    }

    public Unidade getUnidade() {
        return Unidade;
    }

    public void setUnidade(Unidade Unidade) {
        this.Unidade = Unidade;
    }

    public Pedido() {
        
    }

    public Pedido(int codigo, Date data, Cliente Cliente, Unidade Unidade) {
        this.codigo = codigo;
        this.data = data;
        this.Cliente = Cliente;
        this.Unidade = Unidade;
    }


    @Override
    public String toString() {
        return "Pedido{" + "codigo=" + codigo + ", data=" + data + ", Cliente=" + Cliente.toString() + ", Unidade=" + Unidade.toString() + '}';
    }
    
    
    
}
