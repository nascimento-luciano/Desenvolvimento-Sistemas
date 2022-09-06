//Ler dois valores inteiros. Se os valores forem iguais,deverá calcular a soma desses valores, 
//Caso contrário multiplique os dois valores. Ao final de qualquer um dos cálculos,deve-se exibir os valores digitados e o resultado na tela. 
//Utilize o comando JOptionPane para solicitação e exibição de informações ao usuário, OK?

package Agenda5Forum;

import javax.swing.JOptionPane;

/**
 *@author Luciano Silva do Nascimento
 */
public class Agenda5Forum 
{
 
    /**
     * @param args
     */
    public static void main(String[] args)
    {
        
        
        //declaraçao de variáveis 
        int A;                   //armazena valor de A
        int B;                   //armazena valor de B
        int S;                   //armazena valor da soma
        int M;                   //armazena valor da multiplicação
       
        //entrada de dados
        A = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor"));      
        B = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo valor"));

        //processamento de dados   
        //Decisão
        if(A == B)
        {
            S = (A+B);
            JOptionPane.showMessageDialog(null,"A adição entre os dois valores é = " +S);
        
        }
                        
            else
            
            {
                M = (A*B);
                JOptionPane.showMessageDialog(null,"A multiplicação entre os dois valores é = " +M);
            
            }
           
        
    }
}
