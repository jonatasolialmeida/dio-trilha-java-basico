import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.00;

        while (mesada > 0) {
            Double valorDoce = valorAleatorio();

            if (valorDoce > mesada)
                valorDoce += mesada;

            // cod do professor não deixa número negativo
            // pois recebe o valor que tem de mesada p/ cobrir o valor do doce, independente do valor do doce
            // if (valorDoce > mesada)
            //     valorDoce = mesada;

            System.out.println("Doce do valor: R$ " + valorDoce + " Adicionado ao carrinho");
            mesada -= valorDoce;
        }

        System.out.println();
        System.out.println();
        // por causa do cód do professor não precisa da lógica de 
        // diminuir o valor da mesada por ela mesma conforme comentado abaixo
        // System.out.println("Mesada: " + mesada);

        // mas atente que continuo utilizando segundo a lógica que criei nas linhas 10,11
        System.out.println("Mesada: " + (mesada - mesada));
        System.out.println("Joãozinho gastou toda a sua mesada em doces :)");
        
    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}