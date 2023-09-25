public class ExemploException {
    public static void main(String[] args) {
        try {
            // cep com mais de 8 digitos p/ causar erro
            // String formatarCep = formatarCep("123456789");
            // System.out.println(formatarCep);
            String formatarCep2 = formatarCep("12345678");
            System.out.println(formatarCep2);
        } catch (CepInvalidoException e) {
            // TODO Auto-generated catch block
            System.out.println("O Cep não corresponde com as regras de negócio");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
          throw new CepInvalidoException();
        
          //simulando um cep formatado
          return "23.765-064";
    }

}
