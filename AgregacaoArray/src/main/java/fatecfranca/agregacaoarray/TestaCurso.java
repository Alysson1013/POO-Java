/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatecfranca.agregacaoarray;

import java.util.ArrayList;

/**
 *
 * @author alyss
 */
public class TestaCurso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 

        ArrayList<Disciplina> disciplinas = new ArrayList();
        Curso c1 = new Curso(2, "Análise e Desenvolvimento de Sistemas", "Computação", disciplinas);
        
        Disciplina d1 = new Disciplina("poo", "Programação Orientada a Objetos", 30);
        Disciplina d2 = new Disciplina("alp", "Algoritmo e Lógica de Programação", 40);
        Disciplina d3 = new Disciplina("lp", "Linguá Portuguesa", 50);
        
        
        c1.adicionaDisciplina(d1);
        c1.adicionaDisciplina(d2);
        c1.adicionaDisciplina(d3);
        
        // Remove a segunda disciplina
        c1.removeDisciplina(d2);
        
        // Atualiza a terceira disciplina
        c1.atualizarDisciplina(d3, d2);
        
        System.out.println(c1.toString());

    }
    
}
