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

import javax.swing.JOptionPane;

public class Agenda7FicharioFacultativo {

public static void main(String[] args){

    for (int i = 6; i<=10; i++){
        for (int j = 0; j<=10; j++){

            JOptionPane.showMessageDialog(null, "Tabuada do 6 até 10 \n", i+" x "+ j + " = " + i*j); 
            //System.out.println (i+" x "+ j + " = " + i*j);
        }
    }
}

}