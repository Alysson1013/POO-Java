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
public class Apto extends Imovel{
    private int nro;

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public Apto() {
    }

    public Apto(int nro) {
        this.nro = nro;
    }

    public Apto(int nro, String endereco) {
        super(endereco);
        this.nro = nro;
    }

    @Override
    public String toString() {
        return "Apto{" + " nro= " + nro + super.toString() + '}';
    }
    
    
    
    
}
