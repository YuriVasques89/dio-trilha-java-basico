import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo ao SEU BANCO");
        System.out.println("--------------------------");

        System.out.println("Por favor, digite o número da sua conta: ");
        int numeroConta = sc.nextInt();

        System.out.println("Agora, digite o número da sua agência: ");
        String agencia = sc.next();

        System.out.println("Me diga o seu nome: ");
        String nomeCliente = sc.next();
        sc.nextLine();

        System.out.println("E por último, qual seu depósito incial: ");
        float saldo = sc.nextFloat();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " +numeroConta + " e seu saldo de " + saldo + " já está disponível para saque.");
        




    }
}
