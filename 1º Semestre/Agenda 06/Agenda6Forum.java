/*
Para o desafio da semana, temos uma atividade especial pro pessoal que nasceu antes dos anos 90.
Seguinte, todos vocês sabem o que são signos do zodiaco certo ? Pois bem, nosso desafio é bem simples:
- O usuario vai informar o seu signo em formato string minúsculo, 
e então nosso algoritmo deve devolver as datas correspondentes ao signo digitado:
*/

import javax.swing.JOptionPane;


//@author Luciano Silva do Nascimento


public class Agenda6Forum {
    public static void main(String[] args) throws Exception {

        String signo = JOptionPane.showInputDialog(null, "Digite o seu sígno do zodíaco?");
               
         //Switch Case --> Escolha
         switch (signo) {
           case "aries":            
             JOptionPane.showMessageDialog(null, "Opa, você também é de Áries: de 21 março a 20 abril");
             break;

           case "touro":             
             JOptionPane.showMessageDialog(null, "Que legal! Você é do signo de Aldebaran de Touro: de 21 abril a 20 maio");
             break;

           case "gemeos":         
             JOptionPane.showMessageDialog(null, "Tem o mesmo signo do Grande Mestre, Gêmeos: de 21 maio a 20 junho");
             break;

           case "cancer":        
             JOptionPane.showMessageDialog(null, "Este é o signo do Máscara da Morte Câncer: de 21 junho a 22 julho");
             break;

           case "leão":          
             JOptionPane.showMessageDialog(null, "Signo do valente Cavaleiro de Leão: de 23 julho a 22 agosto");
             break;

           case "virgem":    
             JOptionPane.showMessageDialog(null, "O Homem mais próximo de Deus tem o signo de Virgem: de 23 agosto a 22 setembro");
             break;

           case "libra":                       
             JOptionPane.showMessageDialog(null, "Mais sábio dos cavaleiros tem o signo de Libra: de 23 setembro a 22 outubro");
             break;

           case "escorpião":           
             JOptionPane.showMessageDialog(null, "O mesmo signo do orgulhoso cavaleiro de Escorpião: de 23 outubro a 21 novembro");
             break;

           case "sagitário":           
             JOptionPane.showMessageDialog(null, "O grande herói da saga é do signo de Sagitário: de 22 novembro a 21 dezembro");
             break;

           case "capricórnio":         
             JOptionPane.showMessageDialog(null, "Signo do honrado cavaleiro de Capricórnio: de 22 dezembro a 20 janeiro");
             break;

            case "aquário":        
             JOptionPane.showMessageDialog(null, "Você também do mesmo signo do Mago do Gelo, Camus de Aquário: de 21 janeiro a 18 fevereiro");
             break;

            case "peixes":           
             JOptionPane.showMessageDialog(null, "Tem o mesmo signo do mais belo entre os cavaleiros, Afrodite de Peixes: de 19 fevereiro a 20 março");
             break;

            default:           
             JOptionPane.showMessageDialog(null, "Signo desconhecido!");
             break;
            }
        }
    }

