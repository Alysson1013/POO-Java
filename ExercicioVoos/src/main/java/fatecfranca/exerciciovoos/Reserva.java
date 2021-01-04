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
public final class Reserva {
    private String nro;
    private String Data;
    private Voo Voo;
    private Passageiro Passageiro;

    public String getNro() {
        return nro;
    }

    public void setNro(String nro) {
        this.nro = nro;
    }

    public String getData() {
        return Data;
    }

    public void setData(String Data) {
        this.Data = Data;
    }

    public Voo getVoo() {
        return Voo;
    }

    public void setVoo(Voo Voo) {
        this.Voo = Voo;
    }

    public Passageiro getPassageiro() {
        return Passageiro;
    }

    public void setPassageiro(Passageiro Passageiro) {
        this.Passageiro = Passageiro;
    }

    public Reserva() {
    }

    public Reserva(String nro, String Data, Voo Voo, Passageiro Passageiro) {
        setNro(nro);
        setData(Data);
        this.Voo = Voo;
        this.Passageiro = Passageiro;
    }
    
    public String toString(){
       return "Número: " + getNro() + " Data: " + getData() + Voo.toString() + Passageiro.toString();
    }
}
