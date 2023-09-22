import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;
        
        // TODO: conhecer e importar a classe Scanner
        Scanner meuScanner = new Scanner(System.in);

        System.out.println("Digite o número da conta");
        numero = meuScanner.nextInt();
        meuScanner.nextLine();

        System.out.println("Digite o número da agência");
        agencia = meuScanner.nextLine();

        System.out.println("Digite o seu nome");
        nomeCliente = meuScanner.nextLine();

        System.out.println("Digite o valor para abertura de conta");
        saldo = meuScanner.nextDouble();
        meuScanner.nextLine();
        // TODO: Exibir as mensagems para o nosso usuário
        System.out.println("Olá " + nomeCliente + ",obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo R$ " + saldo + " já está disponível para saque");

        // TODO: Exibir a mensagem conta criada
        System.out.println("Conta Criada com Sucesso!");

    }
} 
