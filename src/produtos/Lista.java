/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produtos;

/*
 * @author Luis Guilherme
 */
public class Lista {
    
    private No primeiro;
    private No ultimo;
    private int quantNo;
    
    public Lista(){
        this.primeiro = null;
        this.ultimo = null;
        this.quantNo = 0;
    }       //Construtor

    public No getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(No primeiro) {
        this.primeiro = primeiro;
    }

    public No getUltimo() {
        return ultimo;
    }

    public void setUltimo(No ultimo) {
        this.ultimo = ultimo;
    }

    public int getQuantNo() {
        return quantNo;
    }

    public void setQuantNo(int quantNo) {
        this.quantNo = quantNo;
    }


    //Checar se é vazia
    public boolean vazia(){
        return (this.primeiro == null);
    }
    
    //Inserir Primeiro
    public void inserirPrimeiro(Produto p){
        No novoNo = new No(p);
        if(this.vazia()){
            this.ultimo = novoNo;
        }
        novoNo.setProx(this.primeiro);
        this.primeiro = novoNo;
        this.quantNo++;
    }
    
    //Inserir Ultimo
    public void inserirUltimo(Produto p){
        No novoNo = new No(p);
        if(this.vazia()){
            this.primeiro = novoNo;
        } else {
            this.ultimo.setProx(novoNo);
        }
        this.ultimo = novoNo;
        this.quantNo++;
    }
    
    //Remover algum da lista
    public boolean removerNo(String codigo){
        No atual = this.primeiro;
        No anterior = null;
        if(vazia()){
            return false;
        } else{
            while((atual != null) && (!atual.getP().getCodigo().equals(codigo))){
            anterior = atual;
            atual = atual.getProx();
            }
            if(atual == this.primeiro){
                if(this.primeiro == this.ultimo){
                    this.ultimo = null;
                }
                this.primeiro = this.primeiro.getProx();
            } else{
                if(atual == this.ultimo){
                    this.ultimo = anterior;
                }
                anterior.setProx(atual.getProx());
            }
            this.quantNo--;
            return true;
        }
    }
    
    //Esvaziar lista
    public void esvaziar(){
        this.primeiro = null;
        this.ultimo = null;
    }
    
    //Pesquisar algo
    public String pesquisarNo(String codigo){
        String msg = "";
        No atual = this.primeiro;
        while((atual != null) && (!atual.getP().getCodigo().equals(codigo))){
            atual = atual.getProx();
        }
        return msg = "Código: " + atual.getP().getCodigo() + "\n" + 
                     "Preco: " + atual.getP().getPreco() + "\n" + 
                     "Estoque: " + atual.getP().getEstoque(); 
    }
    
    //Imprimir lista
    public String imprimir(){
        String msg = "";
        if(vazia()){
            msg = "A lista está vazia";
        } else{
           No atual = this.primeiro;
           while(atual != null){
               msg += atual.getP().getCodigo() + " -> ";
               atual = atual.getProx();
           }
        }
        return msg;
    }
}
