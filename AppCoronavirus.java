// Escreva um programa para calcular o percentual de casos de coronavirus nas regioes do Brasil
//---------------------------------------------------------------
// Para tanto, o programa deve ler os seguintes dados:
// 1.  Nome da regiao
// 2.  Numero de casos da regiao
//---------------------------------------------------------------
// O programa deve exibir na tela um painel de dados com as seguintes informacoes:
// 1.  Nome da regiao e o numero de casos
// 2.  Numero de casos no Brasil
// 3.  Porcentual que cada regiao representa em relacao ao total    de casos no Brasil.

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int brasil, sul, sudeste, centro, norte, nordeste;
        double percSul, percSudeste, percCentro, percNorte, percNordeste;

        System.out.printf("\nInforme o numero de casos no sul:\n");
        sul = ler.nextInt();
        System.out.printf("\nInforme o numero de casos no sudeste:\n");
        sudeste = ler.nextInt();
        System.out.printf("\nInforme o numero de casos no norte:\n");
        norte = ler.nextInt();
        System.out.printf("\nInforme o numero de casos no nordeste:\n");
        nordeste = ler.nextInt();
        System.out.printf("\nInforme o numero de casos no centro:\n");
        centro = ler.nextInt();
        brasil = sul + sudeste + norte + nordeste + centro;
        
        percSul = ((double) sul / brasil) * 100;
        percSudeste = ((double) sudeste / brasil) * 100;
        percNorte = ((double) norte / brasil) * 100;
        percNordeste = ((double) nordeste / brasil) * 100;
        percCentro = ((double) centro / brasil) * 100;

        System.out.printf("\nExibir Percentual por Regiao do Brasil:\n\n");

        System.out.printf("%6.2f%% na regiao sul.\n", percSul);
        System.out.printf("%6.2f%% na regiao sudeste.\n", percSudeste);
        System.out.printf("%6.2f%% na regiao norte.\n", percNorte);
        System.out.printf("%6.2f%% na regiao nordeste.\n", percNordeste);
        System.out.printf("%6.2f%% na regiao centro.\n", percCentro);
        System.out.printf("Total de casos no Brasil = %1d", brasil);

    }
}
