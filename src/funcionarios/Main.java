package funcionarios;

import java.util.Scanner;

/**
 *
 * @author Luis Guilherme
 */
public class Main {

     public static char menu(){
        String msg;
        System.out.println("\n1 para inserir funcionário");
        System.out.println("2 para ver média salário/funcionário");
        System.out.println("3 para mostrar maior(es) salário(s)");
        System.out.println("4 para imprimir a lista");
        System.out.println("5 para esvaziar a lista");
        System.out.println("6 para fechar o menu");
        msg = new Scanner(System.in).next();
        return msg.charAt(0);
    }
    
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        Lista lista = new Lista();
        Funcionario f;
        char opcao;
        
        do{
            opcao = menu();
            switch(opcao){
                case '1':
                    if(Lista.quantFunc < 8){
                        f = new Funcionario();
                        System.out.println("Nome funcionário: ");
                        f.setN(l.next());
                        System.out.println("Salário funcionário: ");
                        f.setS(l.nextFloat());
                        lista.inserir(f);
                        }else{
                            System.out.println("\n8 funcionários já registrados");
                        }
                break;
                
                case '2':
                    if(lista.vazia()){
                        System.out.println("\nA lista está vazia");
                    }else{
                    System.out.println("\nR$ " + Lista.soma + " somando os salários");
                    System.out.println(Lista.quantFunc + " funcionário(s)");
                    System.out.println("Média de: R$ " + (Lista.soma/Lista.quantFunc) + " por funcionário");
                    }
                break;
                
                case '3':
                    System.out.println("\nMaior(es) salário(s): " + lista.imprimirMaior());
                break;
                
                case '4':
                    System.out.println("\nLista: " + lista.imprimir());
                break;
                
                case '5':
                    if(lista.vazia()){
                        System.out.println("\nA lista já está vazia");
                    }else{
                        lista.esvaziar();
                        System.out.println("\nLista esvaziada");
                    }
                break;
                
                case '6':
                    System.out.println("\nFim do programa");
                    break;
                default:
                    System.out.println("\nOpção inexistente, tente novamente");
            }
        } while(opcao != '6');
            System.exit(0);
    }
    
}
