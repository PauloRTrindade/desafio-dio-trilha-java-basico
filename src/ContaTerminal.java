import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Por favor, digite o seu Nome (Ex.: João Silva): ");
		String nomeCliente = sc.nextLine();
		System.out.print("Por favor, digite o número da Agência (Ex.: 012-3): ");
		String agencia = sc.nextLine();
		System.out.print("Por favor, digite o número da Conta (Ex.: 1234): ");
		int numeroConta = sc.nextInt();
		System.out.print("Por favor, digite o Saldo (Ex.: 1234.56): ");
		double saldo = sc.nextDouble();

		sc.close();

		System.out.println();
		System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
				+ agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
	}
}