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
public class Unidade {
    private String cidade;
    private String estado;

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Unidade() {
    }

    public Unidade(String cidade, String estado) {
        this.cidade = cidade;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Unidade{" + "cidade=" + cidade + ", estado=" + estado + '}';
    }
    
    
}
