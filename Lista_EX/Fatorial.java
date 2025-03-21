package Lista_EX;

import javax.swing.JOptionPane;
/* Faça um programa para calcular o fatorial
de um número qualquer inteiro positivo
digitado pelo usuário*/
public class Fatorial {
    public static void main(String[] args) {

        int fat = 1;    
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro positivo: "));

        if(num <= 0){
            JOptionPane.showMessageDialog(null,  "Erro! Digite um número inteiro positivo.", "ERRO", JOptionPane.WARNING_MESSAGE );
        }
        else{
            for(int i = 2; i <= num; i++){
                fat *= i;
            }
            JOptionPane.showMessageDialog(null, "O fatorial de " + num + " é " + fat + ".", "Calculo", JOptionPane.INFORMATION_MESSAGE);
        }
    
    }
}
