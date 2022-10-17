/*Paulo, o estudante do Ensino Médio que você conheceu no Mergulhando no Tema, 
agora deseja criar um programa que realize a soma de todos os elementos de uma matriz 10x10, 
contendo números inteiros. Elabore o pseudocódigo e a codificação em linguagem Java de um software 
que resolva o problema de Paulo.  
 */

//importando classes/arquivos
import java.util.Scanner;
//import javax.swing.JOptionPane; //programa utiliza a classe JOptionPane

    /**@author: Luciano Silva do Nascimento
     * @param args
     * @throws Exception
     */

public class Agenda10Fichario {
    public static void main(String[] args) throws Exception {

        int[][] matriz = new int[10][10];
        int soma = 0;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Matriz M{10][10]\n");

    for(int linha = 0; linha < 10; linha++){
        for(int coluna = 0; coluna < 10; coluna++){
            System.out.printf("Digite o elemento M[%d][%d]: ", linha+1,coluna+1);
            matriz[linha][coluna] = entrada.nextInt();
        }
    }

    // Somando os índices das linhas x colunas.
    for (int[] linha : matriz) {
        for (int valor : linha) {
            soma += valor;
        }
    }


    System.out.println("\nA Matriz 10 x 10 ficou assim: \n");
    for(int linha = 0; linha < 10; linha++){
        for(int coluna = 0; coluna < 10; coluna++){
            System.out.printf("\t %d \t", matriz[linha][coluna]);
        }
        System.out.println();
    }
    System.out.println("soma de todos os índices da matriz 10 x 10 é = "+soma);
}


}



