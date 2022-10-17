/*Criem um programa que peça 10 números, armazene eles em um vetor 
e diga qual elemento é o maior, qual é o menor. Quem mostrará a primeira solução?
  
 */

//importando classes/arquivos
import java.util.Scanner;
//import javax.swing.JOptionPane; //programa utiliza a classe JOptionPane

    /**@author: Luciano Silva do Nascimento
     * @param args
     * @throws Exception
     */
 
        public class Agenda9Forum {
        
          public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);
        
            int n = 10;               //determina o tamanho do vetor
            int v[] = new int[n];     //declaração do vetor
            int i;                    //indica a posição
        
        // Entrada de Dados
            for (i=0; i<n; i++) {

              System.out.printf("Digite o %2do. índice de %d: ", (i+1), n);

              v[i] = ler.nextInt();
            }
        
        // Aqui são definidos o maior e o menor valor
            
            int menor = v[0]; // v[0] = 1º. valor armazenador no vetor.

            int maior = v[0];
            
            
            for (i=0; i<n; i++) {
                   
              if (v[i] < menor)
                 menor = v[i];
        
              if (v[i] > maior)
                 maior = v[i];
            }
        
        // Saída de dados
            System.out.printf("\n");

            for (i=0; i<n; i++) {

              if (v[i] == menor)
                System.out.printf("v[%d] = %2d <--- menor elemento do vetor\n", i, v[i]);

              else if (v[i] == maior)
                      System.out.printf("v[%d] = %2d <--- maior elemento do vetor\n", i, v[i]);
                   else System.out.printf("v[%d] = %2d\n", i, v[i]);
            }
        
          }
        
        }