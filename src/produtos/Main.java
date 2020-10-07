/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produtos;

import java.util.Scanner;

/*
 * @author Luis Guilherme
 */
public class Main {
    static int estoque500 = 0;
    
    //Menu da lista
    public static char menu(){
        String msg;
        System.out.println("\n1 para inserir no início");
        System.out.println("2 para inserir no final");
        System.out.println("3 para procurar na lista");
        System.out.println("4 para excluir da lista");
        System.out.println("5 para imprimir a lista");
        System.out.println("6 para adicionar desconto");
        System.out.println("7 para esvaziar a lista");
        System.out.println("8 para fechar o menu");
        msg = new Scanner(System.in).next();
        return msg.charAt(0);
    }
    
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        Lista lista = new Lista();
        Produto p;
        char opcao;
        
        do{
            opcao = menu();
            switch(opcao){
                case '1':
                    if(lista.getQuantNo() < 5){
                        System.out.println("\nInserindo no início");
                        p = new Produto();
                        System.out.print("Código: ");
                        p.setCodigo(l.next());
                        System.out.print("Preço: ");
                        p.setPreco(l.nextFloat());
                        System.out.print("Quantidade: ");
                        p.setEstoque(l.nextInt());
                        if(p.getEstoque() > 500){
                            Main.estoque500++;
                        }
                        lista.inserirPrimeiro(p);
                    }else{
                        System.out.println("\n5 produtos já registrados");
                    }
                    break;
                    
                case '2':
                    if(lista.getQuantNo() < 5){                       
                        System.out.println("\nInserindo no final");
                        p = new Produto();
                        System.out.print("Código: ");
                        p.setCodigo(l.next());
                        System.out.print("Preço: ");
                        p.setPreco(l.nextFloat());
                        System.out.print("Quantidade: ");
                        p.setEstoque(l.nextInt());
                        if(p.getEstoque() > 500){
                            Main.estoque500++;
                        }
                        lista.inserirUltimo(p);
                    }else{
                        System.out.println("5 produtos já registrados");
                    }
                    break;
                    
                case '3':
                    if(lista.vazia()){
                        System.out.println("\nA lista está vazia");
                    } else{
                        System.out.println("\nProcurando produto\nDigite o código: ");
                        String codigo = l.next();
                        if(lista.pesquisarNo(codigo) == null){
                            System.out.println("\nO produto não existe");
                        } else{
                            System.out.println("\nProduto encontrado" + lista.pesquisarNo(codigo)); 
                       }
                    }
                    break;
                    
                case '4':
                    if(lista.vazia()){
                        System.out.println("\nA lista está vazia");
                    } else{
                        System.out.println("\nRemover da lista\nDigite o código: ");
                        String codigo = l.next();
                        if(lista.removerNo(codigo)){
                            System.out.println(codigo + " removido");
                        } else{
                            System.out.println("\nNão foi possível remover o produto " + codigo);
                        }
                    }
                    break;
                    
                case '5':
                    System.out.println("\nLista: " + lista.imprimir());
                    System.out.println("\n Produtos com mais de 500 em estoque: " + estoque500);
                    break;
                
                case '6': 
                    
                    System.out.println("\n Produtos com mais de 500 em estoque: " + estoque500);
                    break;
                case '7':
                    if(lista.vazia()){
                        System.out.println("\nA lista já está vazia");
                    }else{
                        lista.esvaziar();
                        Main.estoque500 = 0;
                        System.out.println("\nLista esvaziada");
                    }
                    break;
                
                case '8':
                    System.out.println("\nFim do programa");
                    break;
                default:
                    System.out.println("\nOpção inexistente, tente novamente");
            }
        } while(opcao != '8');
            System.exit(0);
    }
    
}
