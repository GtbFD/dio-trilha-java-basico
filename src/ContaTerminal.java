import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o número da conta: ");
        int numeroConta = Integer.parseInt(scanner.nextLine());

        System.out.print("\nDigite a agência: ");
        String agencia = scanner.nextLine();

        System.out.print("\nDigite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("\nDigite o saldo: ");
        float saldo = Float.parseFloat(scanner.nextLine());

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo R$ "
                + saldo + ", ja está disponível");
    }
}
