/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatecfranca.exerciciovoos;

/**
 *
 * @author alyss
 */
public final class Voo {
    private int nro;
    private String origem;
    private String destino; 
    
    //Setter
    public final void setNro(int nro) {
        this.nro = nro;
    }

    public final void setOrigem(String origem) {
        this.origem = origem;
    }

    public final void setDestino(String destino) {
        this.destino = destino;
    }
    
    //Getters

    public int getNro() {
        return nro;
    }

    public String getOrigem() {
        return origem;
    }

    public String getDestino() {
        return destino;
    }

    public Voo(int nro, String origem, String destino) {
        setNro(nro);
        setOrigem(origem);
        setDestino(destino);
    }

    public Voo() {
    
    }
    
    @Override
    public String toString(){
        return "Número: "+ getNro() + " Origem: " + getOrigem() +  " Destino: " + getDestino();
    }
}
