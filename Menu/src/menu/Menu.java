
package menu;
import java.util.Scanner;
/**
 *
 * @author luska
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int opcao = 0;
        boolean condicao = true;
        Scanner entrada = new Scanner(System.in);
        
        do {
            // exibicao do menu 
            System.out.println("Digite um numero das opções abaixo: ");
            System.out.println("0 - Sair");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Alterar Cadastro");
            System.out.println("3 - Excluir Cadastro");
            System.out.println("4 - Consultar Cadastro" );
            opcao = entrada.nextInt();
            
            switch(opcao) {
            //usando o valor que foi recebido acima e armazenado na opcao no swich case como parametro
            // foi utilizado a funcao de methods para facilitar programas futuros, esse codigo e um codigo base de menu que sera utilizado em futuros projetos
                case 1:
                    cadastrar();
                    break;
                case 2:
                    alterar();
                    break;
                case 3:
                    excluir();
                    break;
                case 4:
                    consultar();
                    break;
                case 0:
                    condicao = false;
                    break;
                default: 
                    System.out.println("Opção escolhida inv[alida, por favor escolha uma opção de 0 a 4");
            
            }       
        }while(condicao == true);

    }
    
    public static void cadastrar(){
        System.out.println("teste");
    
    }
    
    public static void alterar(){
        System.out.println("teste");
        
    }
      
    public static void excluir(){
        System.out.println("teste");
    
    }
    
    public static void consultar(){
        System.out.println("teste");
    
    }

}
