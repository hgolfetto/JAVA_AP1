package Lista_EX;

import javax.swing.JOptionPane;

public class Pares {
    public static void main(String[] args) {
        int inicio = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
        int fim = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
        
        if (inicio > fim) {
            int temp = inicio;
            inicio = fim;
            fim = temp;
        }
        
        int soma = 0;
        for (int i = inicio; i <= fim; i += 2) {
            if (i % 2 == 0) {
                soma += i;
            }
        }
        
        JOptionPane.showMessageDialog(null, "A soma dos números pares entre " + inicio + " e " + fim + " é " + soma + ".");
    }
    }

