import java.util.Scanner;

public class main {

   private final static String WELCOME_MESSAGE = "Olá, informe o seu nome";

    public static void main(String[] args) {


        char character = 'a';
        byte number = 1;
        short number2 = 2;
        boolean decisao = false;


        Scanner dado = new Scanner(System.in);

        System.out.println(WELCOME_MESSAGE);

        String nome = dado.next();
        System.out.println("Digite sua idade: ");
        int idade = dado.nextInt();

        //uso de printf (print format)
        System.out.printf("Olá %s, sua idade é %s! \n", nome, idade);

    }
}
