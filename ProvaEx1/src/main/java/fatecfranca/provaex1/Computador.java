/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatecfranca.provaex1;

/**
 *
 * @author alyss
 */
public class Computador {
    private String modo;
    private int ram;

    public String isModo() {
        return modo;
    }

    public final void setModo(String modo) {
        if ("Ligado".equals(modo) || "Desligado".equals(modo)){
            this.modo = modo;
        }
    }

    public int getRam() {
        return ram;
    }

    public final void setRam(int ram) {
        if (((ram == 8) || (ram == 4)) || ((ram == 16) || (ram == 32))){
            this.ram = ram;
        }  else {
            System.out.println("ERRO, memória RAM inválida");
        }
    }
    
    public void onOff(String x){
        setModo(x);
    }
    
    public void upgrade(int x){
        setRam(this.ram + x);
    }

    public Computador() {
        
    }
    
    public Computador(boolean ligado, int ram) {
        setRam(ram);
        setModo(modo);
    }

    @Override
    public String toString() {
        return "Computador{" + "modo=" + modo + ", ram=" + ram + '}';
    }
}
