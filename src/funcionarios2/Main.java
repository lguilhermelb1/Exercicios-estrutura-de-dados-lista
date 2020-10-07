/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionarios2;
import java.util.Scanner;

/**
 *
 * @author Luis Guilherme
 */
public class Main {

     public static char menu(){
        String msg;
        System.out.println("\n1 para inserir funcionário");
        System.out.println("2 para imprimir a lista por ordem crescente de salário");
        System.out.println("3 para imprimir a lista por ordem decrescente de salário");
        System.out.println("4 para esvaziar a lista");
        System.out.println("5 para fechar o menu");
        msg = new Scanner(System.in).next();
        return msg.charAt(0);
    }
    
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        Lista lista = new Lista();
        Funcionario f;
        float cont;
        char opcao;
        
        do{
            opcao = menu();
            switch(opcao){
                case '1':
                    if(Lista.quantFunc < 6){
                        f = new Funcionario();
                        System.out.println("Nome funcionário: ");
                        f.setN(l.next());
                        System.out.println("Salário funcionário: ");
                        cont = l.nextFloat();
                        if(cont > 850 && cont < 1200){
                        f.setS((float) (cont - (cont*0.1)));
                        f.setI(10);
                        lista.inserir(f);
                        }else if(cont >= 1200){
                        f.setS((float) (cont - (cont*0.2)));
                        f.setI(20);
                        lista.inserir(f);
                        }else if(cont <= 850){
                        f.setS(cont);
                        f.setI(0);
                        lista.inserir(f);
                        }                    
                        }else{
                            System.out.println("\n6 funcionários já registrados");
                        }
                break;
                
                case '2':
                    if(lista.vazia()){
                        System.out.println("\nA lista está vazia");
                    }else{
                        System.out.println("\nLista crescente: " + lista.imprimirC());
                    }
                break;
                
                case '3':
                    if(lista.vazia()){
                        System.out.println("\nA lista está vazia");
                    }else{
                        System.out.println("\nLista decrescente: " + lista.imprimirD());
                    }
                break;
                
                case '4':
                    if(lista.vazia()){
                        System.out.println("\nA lista já está vazia");
                    }else{
                        lista.esvaziar();
                        System.out.println("\nLista esvaziada");
                    }
                break;
                
                case '5':
                    System.out.println("\nFim do programa");
                    break;
                default:
                    System.out.println("\nOpção inexistente, tente novamente");
            }
        } while(opcao != '5');
            System.exit(0);
    }
    
}
