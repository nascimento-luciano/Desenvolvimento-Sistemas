/*A Padaria de Joaquim faz aniversário na semana que vem e ele e sua família decidiram que, 
 * além de fazer a tradicional comemoração, irão selecionar 10 produtos na padaria para fazer 
 * a promoção da semana de 50% desses produtos
 * ------------------------------------------------------------------------------------------
 * Escreva um fluxograma e o programa em Java, solicitando a entrada de 10 produtos da padaria 
 * (nome e valor do produto) e exiba na tela o nome do produto e seu respectivo valor com 50% 
 * de desconto.
 */

//importação das bibliotecas
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Agenda7Fichario {

    /**
     * @param args
     * @authon Luciano Silva do Nascimento
     */

    public static void main(String[] args){
    
    //declaração das variáveis    
    String produto; double valor; double desconto=0;
    
    //inicialização dos produtos
    String padaria = " ";
    
    //o cabeçalho da instrução for inclui inicialização,
    //condição de continuação do loop e incremento
    for (int contador=0; contador<=10; contador++){
    
    //entrada da especificação do produto
    produto= JOptionPane.showInputDialog("Digite o produto"); padaria +=produto;
    
    //entrada com o valor do produto
    valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto")); desconto += valor;
    
    }
    
    //operação matemática
    desconto = desconto/2;
    
    //retorna o valor da somatória dos produto com desconto de 50%
    JOptionPane.showMessageDialog(null, "O desconto foi de: "+ new DecimalFormat("#.##").format(desconto)); 
    //JOptionPane.showMessageDialog(null, padaria);
    
    }

}// fim da classe Agenda7Fichario