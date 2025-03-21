package Lista_EX;

import javax.swing.JOptionPane;

public class Senha {
    public static void main(String[] args) {

        final char SENHA_CORRETA = 'A'; // Altere para a senha desejada
        int tentativas = 0;

        while (tentativas < 3) {
            // Solicita a senha ao usuário
            String input = JOptionPane.showInputDialog("Digite a senha de acesso:");
            
            // Verifica se o usuário clicou em "Cancelar" ou fechou a janela
            if (input == null) {
                JOptionPane.showMessageDialog(null, "Operação cancelada.");
                return;
            }

            // Verifica se a senha digitada é correta
            if (input.charAt(0) == SENHA_CORRETA) {
                JOptionPane.showMessageDialog(null, "Acesso liberado");
                return; // Sai do programa
            } else {
                tentativas++;
                JOptionPane.showMessageDialog(null, "Senha incorreta. Tentativas restantes: " + (3 - tentativas));
            }
        }

    }
}
