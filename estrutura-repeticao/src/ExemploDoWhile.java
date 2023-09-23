import java.util.Random;

public class ExemploDoWhile {
    public static void main(String[] args) {

        System.out.println("Discando...");
        
        do {
            System.out.println("Telefone Tocando");
        } 

        while(tocando());

        System.out.println("Alô !!!");
    }

    private static boolean tocando() {
        // escolhe um número randomico de 1 a 3
        // verifica no final se é igual a 3 ou não
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu? " + atendeu);

        // aqui negamos o valor por que a função tocando() é usada como verificação no while
        // então nos casos dos números randomicos serem != 1 (o retorno seria false)
        // sendo false, o while pararia de ser executado
        // por isso negamos o resultado, para torná-lo true, e o while continuar rodando 
        return ! atendeu;
    }
}
