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
public class Lista {
    
    private No primeiro;
    private No ultimo;
    private int quantNo;

    public int getQuantNo() {
        return quantNo;
    }

    public void setQuantNo(int quantNo) {
        this.quantNo = quantNo;
    }

    public Lista(){
        this.primeiro = null;
        this.ultimo = null;
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
    
    public boolean vazia(){ //Checar se é vazia
        return(this.primeiro == null);
    }
    
    public void inserirPrimeiro(Aluno a){   //Inserir primeiro da lista
        No novo = new No(a);
        if(this.vazia()){
            this.primeiro = novo;
        }
        novo.setProx(this.primeiro);
    }
    
    public void inserirUltimo(Aluno a){    //Inserir ultimo da lista
        No novo = new No(a);
        if(this.vazia()){
            this.primeiro = novo;
        }else{
            this.ultimo = novo;
        }
        this.ultimo = novo;
    }
    
    public String aprovados(){               //Imprimir aprovados
        No atual = this.primeiro;
        String msg = "";
        int cont = 0;
        if(vazia()){
            msg = "A lista está vazia";
            } else{
                while(atual != null){
                    if(atual.getA().getNota() >= 7){
                        msg += atual.getA().getNome() + " ";
                        cont++;
                    }
                    atual = atual.getProx();
                }
                if(cont == 0){
                    msg += "Nenhum aluno aprovado";
                }
        }
        return msg;
    }
    
    public void esvaziar(){             //Esvaziar lista
        this.primeiro = null;
        this.ultimo = null;
    }
    
}
