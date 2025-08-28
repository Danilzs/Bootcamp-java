import java.util.Scanner;
public class main {

    public static void main(String[] args) {

        Scanner dado = new Scanner(System.in);

        //usando operadores booleanos para dizer se o resultado é false ou true.
        System.out.println("Quanto é 2 + 2?");
        int resultado = dado.nextInt();
        var isRight = resultado == 4;
        System.out.printf("O resultado é 4, você acertou? (%s)\n", isRight);

        System.out.println("Digite sua idade;");
        int idade = dado.nextInt();

        System.out.println("Você é emancipado?");
        var isEmancipated = dado.nextBoolean();

        //uso de OR e AND:
        var canDrive = idade >= 18 || (isEmancipated && idade >=16);

        System.out.printf("Você pode dirigir? (%s) \n", canDrive);

        //tabela de retornos booleanos:
        System.out.println("========================================");
        System.out.printf("true && true = %s\n", true && true);
        System.out.printf("false && false = %s \n", false && false);
        System.out.printf("true && false = %s \n", true && false);
        System.out.printf("false && true = %s \n", false && true);
        System.out.println("========================================");
        System.out.printf("true || true = %s \n", true || true);
        System.out.printf("false || false = %s \n", false || false);
        System.out.printf("true || false = %s \n", true || false);
        System.out.printf("false || true = %s \n", false || true);
        System.out.println("========================================");
        System.out.printf("!true = %s \n", !true);
        System.out.printf("!false = %s \n", !false);

    }
}
