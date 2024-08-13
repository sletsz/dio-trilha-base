import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;
        Scanner leia = new Scanner(System.in);

        
        System.out.println("Digite o seu nome: ");
        nomeCliente = leia.nextLine();
        
        System.out.println("Digite sua agencia: ");
        agencia = leia.nextLine();

        System.out.println("Digite numero da conta: ");
        numeroConta = leia.nextInt();

        System.out.println("Digite seu saldo: ");
        saldo = leia.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + 
                agencia + ", conta " + numeroConta + ", e seu saldo " + saldo + " já está disponivel para saque ");
    }
}
