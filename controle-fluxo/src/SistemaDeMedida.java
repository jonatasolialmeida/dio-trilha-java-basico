public class SistemaDeMedida {
    public static void main(String[] args) {
        String sigla = "M";
        String sigla2 = "A";

        // if(sigla == "P")
        //     System.out.println("Pequeno");
        // else if(sigla == "M")
        //     System.out.println("Médio");
        // else if(sigla == "G")
        //     System.out.println("Grande");
        // else
        //     System.out.println("Indefinido");

        // Switch case
        switch (sigla2) {
            case "P": {
                System.out.println("Pequeno");
                break;
            }
            case "M": {
                System.out.println("Médio");
                break;
            }
            case "G": {
                System.out.println("Grande");
                break;
            }
            default:
                System.out.println("Indefinido");
        }
    }
}
