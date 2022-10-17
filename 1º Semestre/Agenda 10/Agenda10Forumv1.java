/*Imagine um prédio de estacionamentos, onde as garagens são identificadas 
pelo número do andar e pelo número das vagas. Você precisa fazer um programa 
para cadastrar as vagas dos carros. São 2 andares e 4 vagas de garagem por andar.  
 */

//importando classes/arquivos
import java.util.Scanner;
//import javax.swing.JOptionPane; //programa utiliza a classe JOptionPane

    /**@author: Luciano Silva do Nascimento
     * @param args
     * @throws Exception
     */

public class Agenda10Forumv1 {
    
    public static void main(String[] args){
        int[][] matriz = new int[2][4];
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Prédio de [2]andares e [4]vagas\n");
        
        for(int andar=0 ; andar < 2 ; andar++){
            for(int vaga = 0; vaga < 4 ; vaga ++){
                System.out.printf("Insira o número da placa no seguinte andar[%d] e vaga[%d]: ",andar+1,vaga+1);
                matriz[andar][vaga]=entrada.nextInt();
            }
        }
        
        System.out.println("\n Tabela com as placas cadastradas: \n");
        for(int andar=0 ; andar < 2 ; andar++){
            for(int vaga = 0; vaga < 4 ; vaga ++){
                System.out.printf("\t %d \t",matriz[andar][vaga]);
            }
            System.out.println();
        }
       
    }

}