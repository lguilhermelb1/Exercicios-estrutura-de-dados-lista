/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionarios3;

/**
 *
 * @author Luis Guilherme
 */
public class No {
    private Funcionario f;
    private No prox;
    
    public No(Funcionario fn){
        this.f = fn;
        this.prox = null;
    }

    public Funcionario getF() {
        return f;
    }

    public void setF(Funcionario f) {
        this.f = f;
    }

    public No getProx() {
        return prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }
}
