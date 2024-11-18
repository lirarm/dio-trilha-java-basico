import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor digite o número da sua Conta: ");
        int numero = scanner.nextInt();

        System.out.println("Por favor digite o número da sua Agencia: ");
        String agencia = scanner.next();

        System.out.println("Por favor digite o seu nome completo: ");
        String nomeCliente = scanner.next();

        System.out.println("Por favor digite o valor do seu depósito: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}
