/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionarios2;

/**
 *
 * @author Luis Guilherme
 */
public class Lista {
   
    private No primeiro;
    static int quantFunc = 0;
   
    public Lista(){
        this.primeiro = null;
       
    }       //Construtor

    public No getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(No primeiro) {
        this.primeiro = primeiro;
    }
    
    //Insere Funcionário(No)
    public void inserir(Funcionario f) {      
        if(this.primeiro == null) {     //Checa se está vazio e insere
        No novo = new No(f);
        this.primeiro = novo;
        quantFunc++;
        return;
    
    // Checa a "colocação" na lista
    }else if(this.primeiro.getF().getS() > f.getS()){     
        No novo = new No(f);
        novo.setProx(this.primeiro);
        this.primeiro = novo;
        quantFunc++;
        return;
    }else {
        No atual = this.primeiro;
        while(atual != null) {
            if(atual.getProx() == null) {
                No novo = new No(f);
                atual.setProx(novo);
                quantFunc++;
            return;
      } else if(f.getS() < atual.getProx().getF().getS()) {
            No novo = new No(f);
            novo.setProx(atual.getProx());  
            atual.setProx(novo);
            quantFunc++;
            return;
        }
        atual = atual.getProx();
        }
    }
    return;
    }
    
    public boolean vazia(){
        return (this.primeiro == null);
    }
    
    // Imprimir lista em ordem Crescente
    public String imprimirC(){
        String msg = "";
        if(vazia()){
            msg = "A lista está vazia";
        } else{
           No atual = this.primeiro;
           while(atual != null){
               msg += atual.getF().getN() + " Imposto: " + atual.getF().getI() + " Receber: " + atual.getF().getS() + " -> ";
               atual = atual.getProx();
           }
        }
        return msg;
    }
    
    //Imprimir lista em ordem decrescente
    public String imprimirD(){
        String msg = "";
        if(vazia()){
            msg = "A lista está vazia";
        } else{
           No atual = this.primeiro;
           while(atual != null){
               msg += " <- " + atual.getF().getN() + " Imposto: " + atual.getF().getI() + " Receber: " + atual.getF().getS();
               atual = atual.getProx();
           }
        }
        return msg;
    }
   
    //Esvaziar lista
    public void esvaziar(){
    this.primeiro = null;
    this.quantFunc = 0;
    } 
}
