/*Faça um fluxograma e a codificação em JAVA que de um programa que peça ao usuário 
a digitação do NOME e IDADE de 10 pessoas. Verificar se cada idade digitada é maior 
que 18 anos e exibir na tela MAIOR DE IDADE, caso contrário MENOR DE IDADE.*/

//importa a biblioteca
import javax.swing.JOptionPane;

//tipo de classe
public class Agenda7Forum 

{

/**
 * @author Luciano Silva do Nascimento
 * @param args
 */
// construtor inicializa variáveis de instância
 public static void main(String[] args) 

{

int count; // variável de controle também utilizada depois que loop termina

for (count = 1; count <=10; count++) //faz o loop 10 vezes

{
   //apresenta a janela para inserir o nome da pessoa
   JOptionPane.showInputDialog(null, "Digite o nome da pessoa");

   //variável de entrada
   int idade = 0;

   //apresenta a janela para inserir a idade da pessoa
   idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade da pessoa"));
   
   {
   
    if (idade >= 18) //Condicional if-else
    {
        JOptionPane.showMessageDialog(null, "MAIOR DE IDADE");
    } else {
        JOptionPane.showMessageDialog(null, "MENOR DE IDADE");
           }

   }

}

}

} // fim da classe