
//OAtendendo ao Estatuto, escreva um programa que solicite a idade do usuário a ser atendido 
//a fim de encaminhá-lo para a fila comum, se a idade for menor que 60 anos, para a fila 
//prioritária, se a idade tiver 60 anos ou mais e para a “fila 80+”, se a idade for maior que 80 anos. 
//Apresente a resposta com a codificação em linguagem de programação Java.

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Agenda5Fichario {

    /**
     * @author Luciano Silva do Nascimento
     * 
     * @param args
     */
    public static void main(String[] args) {

        //Declaraçao de variáveis 
       int idade;
       int sair = 1;
       
       ArrayList<Integer> filaPrioritaria = new ArrayList<Integer>();  
       ArrayList<Integer> filaNormal = new ArrayList<Integer>();
       ArrayList<Integer> fila80Mais = new ArrayList<Integer>();

       //Laços
       while (sair!=0) {

           //Esta função apresenta uma caixa de diálogo "Input Text"
           idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a sua idade?"));        

           //Condicional IF ELSE
           if(idade<60) {

            JOptionPane.showMessageDialog(null,"Por favor, vá para fila comum!");

               filaNormal.add(idade);

           //Caso a condição anterior não for verdadeira executar um novo IF ELSE
           }else if (idade >= 60 && idade <= 80) {

            //Esta função apresenta uma caixa de diálogo "Output Text"
            JOptionPane.showMessageDialog(null,"Por favor, vá para fila preferencial!");

               filaPrioritaria.add(idade);

               fila80Mais.add(idade);

           }

           else {

            //Esta função apresenta uma caixa de diálogo "Output Text"
            JOptionPane.showMessageDialog(null,"Por favor, vá para fila 80+");

           }

        }   //Fim do programa

    }

}