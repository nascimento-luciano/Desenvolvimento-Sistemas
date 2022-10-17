/*Um cinema possui capacidade de 40 lugares e está sempre com ocupação total. 
Certo dia, cada espectador respondeu a um questionário, no qual constava:

  - idade;

  - opinião em relação ao filme, segundo as seguintes notas:

      A - Ótimo /  B - Bom / C - Regular  / D - Ruim  / E -  Péssimo.
------------------------------------------------------------------------------
Elabore a codificação em JAVA para que leia os dados, calcule e exiba na tela:

 - a quantidade de respostas "ótimo";

- a média de idade das pessoas que responderam "ruim";

- a porcentagem de respostas "péssimo".
 */

//importando as bibliotecas     
import javax.swing.JOptionPane; //programa utiliza a classe JOptionPane

public class Agenda8FicharioJOption {
    /**
     * @param args
     * @authon: Luciano Silva do Nascimento
     * 
     */
    public static void main(String[] args){
        
        //declaração de variaveis      
        int idade;
        int QtdEntrevistado=0;
        int maiorIdade=0;
        int Otimo=0; 
        int Ruim=0; 
        int Pessimo=0;    
        float idadeRuim=0;
        float mediaIdadeRuim;
        double percPessimo=0;    

        //fase de processamento utiliza repetição controlada por contador
        while(QtdEntrevistado <= 39) {

        //incremento    
        QtdEntrevistado++;
       
            //entrada com a idade do entrevistado
            idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a idade do entrevistado:"));
                         
            //alternativas para o entrevistado escolher
            int alternativa = Integer.parseInt(JOptionPane.showInputDialog("\nOpinião em relação ao filme de 1 a 5."+
            "\n1 - Otimo" +
            "\n2 - Bom" +
            "\n3 - Regular" +
            "\n4 - Ruim" +
            "\n5 - Pessimo")); 
           
            //exibe a resposta do entrevistado
            JOptionPane.showMessageDialog(null, "Resposta >> " +alternativa);
            
            //resposta de quem é maior de idade
            if(alternativa == 5){
                if(idade > maiorIdade){
                    maiorIdade = idade;
                }
            }//fim do if
                   
            if (alternativa == 1){
                Otimo = Otimo + 1;
            }
            
            if (alternativa == 4){
                Ruim += 1;
                idadeRuim += idade;
            }
            if (alternativa == 5){
                Pessimo += 1;
            }
    }//fim do while           
           
            //percentual da qtd de entrevistados que responderam pessimo
            percPessimo = ((double)Pessimo/(double)QtdEntrevistado)*100;
           
            //-----------Resposta 1-----------------------------------------------------------------------------------------------------
            //a quantidade de respostas "ótimo";
            JOptionPane.showMessageDialog(null, "\nQuantidade de pessoas que responderam 'Ótimo': " +Otimo);
            //-----------Fim da Resposta 1-----------------------------------------------------------------------------------------------

                                  
            //-----------Resposta 2-----------------------------------------------------------------------------------------------------
            //a média de idade das pessoas que responderam "ruim";
            if(Ruim != 0){
                mediaIdadeRuim = idadeRuim/Ruim;
                JOptionPane.showMessageDialog(null, "\nA média de idade das pessoas que responderam 'Ruim':  " +mediaIdadeRuim);
                //System.out.printf("Resposta 2 >>> A média de idade das pessoas que responderam ruim: %.2f.", mediaIdadeRuim);
            }
            else{
                JOptionPane.showMessageDialog(null, "\nNinguém optou pela resposta 'Ruim'.");                
            }
            //-----------Fim da Resposta 2------------------------------------------------------------------------------------------------


            //-----------Resposta 3-------------------------------------------------------------------------------------------------------
            //a porcentagem de respostas "péssimo".
            JOptionPane.showMessageDialog(null, "\nPorcentagem de quem respondeu 'Péssimo':  " +percPessimo +"%");
            //-----------Fim da Resposta 3------------------------------------------------------------------------------------------------
            
    }
}

