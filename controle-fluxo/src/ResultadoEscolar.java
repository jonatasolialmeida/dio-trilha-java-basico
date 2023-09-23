public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 6;

        // if(nota >= 7)
        //     System.out.println("Aprovado");
            
        // else if (nota >=5 && nota < 7)
        //     System.out.println("Prova de recuperação");
            
        // else
        //     System.out.println("Reprovado");
        
        // Operador ternário
        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
        
            System.out.println(resultado);

        // Operador ternário encadeado
        String resultado2 = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Prova de Recuperação" : "Reprovado";
        
            System.out.println(resultado2);
    }
}
