package funcionarios;

/**
 *
 * @author Luis Guilherme
 */
public class Lista {
   
    private No primeiro;
    static float soma = 0;
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
        this.soma = soma + f.getS();
        quantFunc++;
        return;
    
    // Checa a "colocação" na lista  
    }else if(this.primeiro.getF().getS() < f.getS()){     
        No novo = new No(f);
        novo.setProx(this.primeiro);
        this.primeiro = novo;
        this.soma = soma + f.getS();
        quantFunc++;
        return;
    }else {
        No atual = this.primeiro;
        while(atual != null) {
            if(atual.getProx() == null) {
                No novo = new No(f);
                atual.setProx(novo);
                this.soma = soma + f.getS();
                quantFunc++;
            return;
      } else if(f.getS() > atual.getProx().getF().getS()) {
            No novo = new No(f);
            novo.setProx(atual.getProx());  
            atual.setProx(novo);
            this.soma = soma + f.getS();
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
    
    //Identificando maior valor
    public String imprimirMaior(){
        String msg = "";
        if(vazia()){
            msg = "A lista está vazia";
        } else{
        float maior = this.primeiro.getF().getS();
        No atual = this.primeiro;
           while(atual != null){
               if(atual.getF().getS() > maior){
                   maior = atual.getF().getS();
               }
               atual = atual.getProx();
           } 
    
    //Mostrar os nomes de maior valor
        while(atual != null){
            if(atual.getF().getS() == maior){
                msg += atual.getF().getN() + " ";              
            }
            atual = atual.getProx();        
        }
        }
        return msg;
    }
    
    // Imprimir lista
    public String imprimir(){
        String msg = "";
        if(vazia()){
            msg = "A lista está vazia";
        } else{
           No atual = this.primeiro;
           while(atual != null){
               msg += atual.getF().getN() + " -> ";
               atual = atual.getProx();
           }
        }
        return msg;
    }
   
    //Esvaziar lista
    public void esvaziar(){
    this.primeiro = null;
    this.soma = 0;
    this.quantFunc = 0;
    } 
}
