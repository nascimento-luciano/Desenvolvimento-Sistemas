/*
O escritório de Despachante Vale Card é uma empresa especializada em documentação 
de veículos atuando diretamente com os órgãos de trânsito. Entre suas atividades, 
está informar para seus clientes o mês de vencimento do IPVA de seus veículos. 
Para isso, o cliente fornece o número final da placa do veículo, em seguida deve 
ser apresentado o mês que o IPVA deve ser pago, conforme tabela a seguir:
*/

import javax.swing.JOptionPane;


//@author Luciano Silva do Nascimento

public class Agenda6Fichario {
   
    public static void main(String[] args) throws Exception {

        String placa = JOptionPane.showInputDialog(null, "Por favor! Informe o número final da placa.");
               
         //Switch Case --> Escolha
         switch (placa) {
           case "1":            
             JOptionPane.showMessageDialog(null, "Pagamento até 30/04");
             break;

           case "2":             
             JOptionPane.showMessageDialog(null, "Pagamento até 31/05");
             break;

           case "3":         
             JOptionPane.showMessageDialog(null, "Pagamento até 30/06");
             break;

           case "4":        
             JOptionPane.showMessageDialog(null, "Pagamento até 31/07");
             break;

           case "5":          
             JOptionPane.showMessageDialog(null, "Pagamento até 31/08");
             break;

           case "6":    
             JOptionPane.showMessageDialog(null, "Pagamento até 30/09");
             break;

           case "7":                       
             JOptionPane.showMessageDialog(null, "Pagamento até 31/10");
             break;

           case "8":           
             JOptionPane.showMessageDialog(null, "Pagamento até 30/11");
             break;

           case "9":           
             JOptionPane.showMessageDialog(null, "Pagamento até 31/12");
             break;

           case "0":         
             JOptionPane.showMessageDialog(null, "Pagamento até 31/12");
             break;

            default:           
             JOptionPane.showMessageDialog(null, "Origem desconhecida!");
            }
        }
    }

