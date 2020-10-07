/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alunos;

import java.util.Scanner;

/*
 * @author Luis Guilherme
 */
public class Main {
    
    //Menu da lista
    public static char menu(){
        String msg;
        System.out.println("\n1 para inserir no início");
        System.out.println("2 para inserir no final");
        System.out.println("3 para imprimir aprovados");
        System.out.println("4 para esvaziar a lista");
        System.out.println("5 para fechar o menu");
        msg = new Scanner(System.in).next();
        return msg.charAt(0);
    }
    
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        Lista lista = new Lista();
        Aluno a;
        char opcao;
        
        do{
            opcao = menu();
            switch(opcao){
                case '1':
                    if(lista.getQuantNo() < 5){
                        System.out.println("\nInserindo no início");
                        a = new Aluno();
                        System.out.print("Nome: ");
                        a.setNome(l.next());
                        System.out.print("Nota: ");
                        a.setNota(l.nextFloat());
                        lista.inserirPrimeiro(a);
                    }else{
                        System.out.println("\n5 alunos já registrados");
                    }
                    break;
                    
                case '2':
                    if(lista.getQuantNo() < 5){                       
                        System.out.println("\nInserindo no final");
                        a = new Aluno();
                        System.out.print("Nome: ");
                        a.setNome(l.next());
                        System.out.print("Nota: ");
                        a.setNota(l.nextFloat());
                        lista.inserirUltimo(a);
                    }else{
                        System.out.println("\n5 alunos já registrados");
                    }
                    break;
                    
                case '3':
                    System.out.println("Alunos aprovados: " + lista.aprovados()); 
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