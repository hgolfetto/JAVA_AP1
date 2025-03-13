import java.util.Scanner;

public class Study {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalAlunos = 10;
        int contador = 0;
        int eleitores = 0;
        int somaNaoEleitores = 0;
        int naoEleitores = 0;

        while (contador < totalAlunos) {
            System.out.print("Digite a idade do aluno " + (contador + 1) + ": ");
            int idade = scanner.nextInt();

            if (idade >= 16) {
                eleitores++; // Conta alunos com 16 anos ou mais
            } else {
                somaNaoEleitores += idade; // Soma idade dos não eleitores
                naoEleitores++; // Conta quantos não eleitores existem
            }
            contador++; // Incrementa o contador para não entrar em loop infinito
        }

        // Calcula a média de idade dos que não podem votar
        double mediaNaoEleitores = (naoEleitores > 0) ? (double) somaNaoEleitores / naoEleitores : 0;

        System.out.println("\nQuantidade de alunos que podem votar: " + eleitores);
        System.out.printf("Média de idade dos alunos que NÃO podem votar: %.2f%n", mediaNaoEleitores);

        scanner.close();
    }
}