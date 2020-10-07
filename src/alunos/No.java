/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alunos;

/**
 *
 * @author Luis Guilherme
 */
public class No {
    
    private Aluno a;
    private No prox;

    public No(Aluno al){
        this.a = al;
        this.prox = null;
    }       //Construtor
    
    public Aluno getA() {
        return a;
    }

    public void setA(Aluno a) {
        this.a = a;
    }

    public No getProx() {
        return prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }
    
}
