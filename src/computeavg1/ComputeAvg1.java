import java.util.Scanner;

public class ComputeAvg1 {

    public static void main(String[] args) {
        // Criar um Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Array para armazenar as cinco pontuações de teste
        int[] testScores = new int[5];

        // Pedir ao usuário para inserir as cinco pontuações de teste
        System.out.println("Digite as cinco pontuações dos testes:");

        for (int i = 0; i < testScores.length; i++) {
            System.out.printf("Teste %d: ", i + 1);
            testScores[i] = scanner.nextInt();
        }

        // Fechar o Scanner após a entrada de dados
        scanner.close();

        // Calcular a média das pontuações de teste
        double averageScore = calculateAverage(testScores);

        // Exibir a média calculada
        System.out.printf("A média das pontuações dos testes é: %.2f\n", averageScore);
    }

    // Método para calcular a média de um array de inteiros
    public static double calculateAverage(int[] scores) {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return (double) sum / scores.length;
    }
}
