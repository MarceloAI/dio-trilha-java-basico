import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.print("Por favor, digite o número da Agência: ");
        numero = scanner.nextInt();
        System.out.print("Digite o código da Agência: ");
        agencia = scanner.next();
        System.out.print("Digite seu nome: ");
        scanner.nextLine();
        nomeCliente = scanner.nextLine();
        System.out.print("Digite o saldo: ");
        saldo = scanner.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque", nomeCliente, agencia, numero, saldo);

        scanner.close();
    }
}