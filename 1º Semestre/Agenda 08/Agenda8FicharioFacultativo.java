/*Giovanna adora usar computador, navegar na internet e matemática. 
* Ela decidiu estudar tabuada devido a sua dificuldade durante o 
* período de aula (ela apenas sabe as tabuadas dos números 0 até 05).
* Ao navegar na internet, aprendeu a desenvolver alguns algoritmos 
* e decidiu desenvolver algo para ajudá-la em seus estudos com tabuada.
* Escreva para Giovanna um Fluxograma e um Programa em Java da Tabuada dos números 6 até 10.
*/

    /*
     * @param args
     * @authon Luciano Silva do Nascimento
     */

    public class Agenda8FicharioFacultativo {
    
    public static void main(String[] args){
    
        //inicialização da fase
        int i = 5;

        //fase do processo de repetição
        while (i<=9){
            i++;

            int j = 0;
            while (j<10){
                j++;
    
                //saída com o resultado da tabuada
                System.out.println (i+" x "+ j + " = " + i*j);
            }
        }
    }
    
    }
    