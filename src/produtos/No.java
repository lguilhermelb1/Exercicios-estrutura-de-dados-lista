/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produtos;

/*
 * @author Luis Guilherme
 */
public class No {
    
    private Produto p;
    private No prox;
    
    public No(Produto pe){
        this.p = pe;
        this.prox = null;
    }       //Construtor

    public Produto getP() {
        return p;
    }

    public void setP(Produto p) {
        this.p = p;
    }

    public No getProx() {
        return prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }
    
    
}
