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
public class Casa extends Imovel{
    private float quintal;

    public float getQuintal() {
        return quintal;
    }

    public void setQuintal(float quintal) {
        this.quintal = quintal;
    }

    public Casa() {
    }

    public Casa(float quintal) {
        this.quintal = quintal;
    }

    public Casa(float quintal, String endereco) {
        super(endereco);
        this.quintal = quintal;
    }

    @Override
    public String toString() {
        return "casa{" + " quintal= " + quintal + super.toString() +'}';
    }
}
