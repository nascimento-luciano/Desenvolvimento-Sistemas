// Na agenda 2, escrevemos um algoritmo para calcular a area de um
// retangulo, voce se lembra? Dando continuidade ao nosso desafio,
// com base no algoritmo que voce escreveu,
// faca um programa em Java para calcular a area do retangulo.

import java.util.Scanner;

public class AreaRetangulo {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int base, altura;
        double area;

        System.out.printf("Informe a base:\n");
        base = ler.nextInt();
        System.out.printf("\nInforme a altura:\n");
        altura = ler.nextInt();

        area = base * altura;

        System.out.printf("\nExibir o valor da area:\n\n");

        System.out.printf("area = %6.2f", area);

    }

}
