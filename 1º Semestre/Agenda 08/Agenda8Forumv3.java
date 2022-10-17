/*Desafio da semana:
//Elabore um programa em Java utilizando o WHILE ou o DO..WHILE 
//para ler do teclado um número e enquanto esse número for diferente de 0, 
//calcule e imprima se o número é divisível por 3 ou não.
//Ao sair da estrutura de repetição, mostre o total de números digitados que eram divisíveis por 3.
// */

//importando classes/arquivos
//import java.util.Scanner;
import javax.swing.JOptionPane; //programa utiliza a classe JOptionPane

public class Agenda8Forumv3 {

    /**@author: Luciano Silva do Nascimento
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        
        //inicialização
        int numero=3;       
        int total=0;       
        int n[] = new int[10];                       
        
        for (int i = 0; i < n.length; i++) {    
         
            //entrada com de dados
            n[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + (1 + i) + "º numero"));    
        }
         
        //inicialização
        int i = 0;

        //Laço ou Loop de repetição
        while (i < n.length) {

            //incremento
            i++;
            
            if ((n[i])%numero==0) //Testa se é divisível por 3.
            {
                //incremento
                total++;

                //saida informando que é divisível e o total de números divisíveis            
                System.out.println(n[i] +" é divisível por três." +"     --------------> " +"Total de números divisíveis por três é igual a " +total);
                   
            
        }else {           
                  
            //saida informando que não é divisível                      
            System.out.println(n[i] +" não é divisível por três.");
                      
        }
                
        } 
    }

}

