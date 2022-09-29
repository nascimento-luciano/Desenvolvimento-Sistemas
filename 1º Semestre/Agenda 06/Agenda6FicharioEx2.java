/*Maurício está desenvolvendo um programa em Java que consiste 
na leitura do número de um voo e no peso, em quilogramas, 
de 10 de bagagens a serem despachadas. O programa deve calcular 
o peso total da carga e o peso médio de cada volume de bagagem.
----------------------------------------------------------------
Durante os testes do programa, Maurício deparou-se com um problema de entrada de dados. 
O programa que ele estava desenvolvendo fechava inesperadamente quando o usuário inseria 
no sistema um tipo de dado incompatível com o declarado na variável utilizada para o 
armazenamento da informação. Isso pode vir a causar um grande transtorno, 
pois o usuário fica sem saber motivo do programa encerrar-se intempestivamente.
Considerando que o número do voo consiste em uma sequência alfanumérica e que uma 
bagagem pode ter um peso que inclua casas decimais, relate como Maurício pode 
resolver esse problema utilizando tratamento de erros.
*/


//Importar bibliotecas
import java.util.Scanner;
import javax.swing.JOptionPane;


//@author Luciano Silva do Nascimento

public class Agenda6FicharioEx2 {
    public static void main(String[] args)  {
        
    
        //Declaração de variáveis
        int numvoo = 0;        
        int count = 1;        
        double pesomala = 0;        
        double pesototal = 0;
        
        String temp;       
        boolean check = false;        
        Scanner entrada = new Scanner(System.in);

        //Criando laço
        while(check==false) {
        
        //JOptionPane.showInputDialog(null, "Informe o número do seu Voo: ");
        System.out.println("Informe o número do seu Voo: ");
        
        temp = entrada.nextLine();
 
        //entrada de dados     
        try {
        
        numvoo = Integer.parseInt(temp);
        
        if(numvoo>0) {
        
        check = true;
        
        //JOptionPane.showMessageDialog(null, "Número do voo cadastrado com sucesso!");
        System.out.println("Número do voo cadastrado com sucesso!\\n");
        
        }else {
        
        //JOptionPane.showMessageDialog(null, "Informe um valor positivo!");
        System.out.println("Informe um valor positivo!\\n");
        
        }
        
        }catch(NumberFormatException e) {
                   
        //JOptionPane.showMessageDialog(null, "informe um valor numérico!");
        System.out.println("informe um valor numérico!(Ex: 30)\\n");
      
        continue;
        
        }
        
        }
        
        for(int i=0;i<10;i++) {
        
        check = false;
        
        //JOptionPane.showMessageDialog(null, "Voo número "+numvoo);
        System.out.println("Voo número "+numvoo);
        
        while(check==false) {
        
        //JOptionPane.showInputDialog(null, "Informe o peso da mala nº " +count+": ");
        System.out.println("Informe o peso da mala nº "+count+": ");
        
        temp = entrada.nextLine();
        
        try {
        
        pesomala = Double.parseDouble(temp);
        
        if(pesomala>0) {
        
        //JOptionPane.showMessageDialog(null, "Peso da mala "+ count+ " cadastrado com sucesso!");
        System.out.println("Peso da mala "+ count+ " cadastrado com sucesso!");
        
        count++;
        
        check = true;
        
        }else {
        
        //JOptionPane.showMessageDialog(null, "Informe um valor positivo!");
        System.out.println("Informe um valor positivo!\\n");
        
        }
        
        }catch(Exception e) {
        
        //JOptionPane.showMessageDialog(null, "informe um valor real separando decimais com ponto!(Ex: 8.43)");
        System.out.println("informe um valor real separando decimais com ponto!(Ex: 3.14)\\n");
        
        continue;
        
        }
        
        }
        
        pesototal = pesototal + pesomala;

        //JOptionPane.showMessageDialog(null, "Peso parcial: "+pesototal+" Kg");        
        System.out.println("Peso parcial: "+pesototal+" Kg");

        //JOptionPane.showMessageDialog(null, "Peso médio: "+pesototal/(count - 1)+" Kg"); 
        System.out.println("Peso médio: "+pesototal/(count - 1)+" Kg\\n");
        
        }
        
        entrada.close();
        
        //JOptionPane.showMessageDialog(null, "O Peso Total das malas é: "+pesototal+" Kg"); 
        System.out.println("O Peso Total das malas é: "+pesototal+" Kg");
        
        //JOptionPane.showMessageDialog(null, "O Peso Médio das Mala é: "+pesototal/(count - 1)+" Kg"); 
        System.out.println("O Peso Médio das Mala é: "+pesototal/(count - 1)+" Kg");
        
        }
        
        
    }
