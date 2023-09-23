public class ExemploFor {
    public static void main(String[] args) {

        // for (int i = 0; i < 20; i++) {
        //     System.out.println(i + 1 + (i < 9 ? " Carneirinho" : " Carnerinhos"));
        // }

        for (int i = 0; i < 20; i++) {
            if (i < 9)
                System.out.println(i + 1 + " Carneirinho");
            else
                System.out.println(i + 1 + " Carneirinhos");

        }
    }
}