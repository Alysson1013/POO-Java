/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatecfranca.lista0;

import javax.swing.JOptionPane;

/**
 *
 * @author alyss
 */

//Essa classe tera o metodo principal main
public class TestaProduto {
    public static void main(String args[]){
        Produto obj1 = new Produto("Alcool Gel", 13, 8);
        
        
        Produto obj2 = new Produto("Máscara", 9, 5);
        
        Produto obj3 = new Produto();
        obj3.nome = JOptionPane.showInputDialog("Infome o nome do Objeto: ");
        obj3.preco = Float.parseFloat(JOptionPane.showInputDialog("Informe o preço do Objeto"));
        obj3.qtde = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade do Objeto"));
        
        // vamos mostrar para o usuário
        obj1.comprar(3);
        obj2.vender(2);
        obj3.vender(1);
        
        obj1.aumentarPreco(7);
        obj2.diminuirPreco(2);
        obj3.aumentarPreco(4);

        obj1.mostrar();
        obj2.mostrar();
        obj3.mostrar();
        
    }
}
