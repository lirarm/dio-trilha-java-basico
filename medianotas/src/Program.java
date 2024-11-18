import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura das notas
        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();

        // Cálculo da média ponderada
        double media = (nota1 * 3.5 + nota2 * 7.5) / 11;

        // Impressão do resultado com 5 casas decimais
        System.out.printf("MEDIA = %.5f\n", media);

        scanner.close();
    }
}
