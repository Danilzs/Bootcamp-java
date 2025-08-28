import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner dado = new Scanner(System.in);

        System.out.println("informe o primeiro numero:");
        var value1 = dado.nextFloat();
        System.out.println("Informe o segundo numero:");
        var value2 = dado.nextFloat();
        var soma = value1 + value2;

        System.out.printf("A operação de %s + %s é = %s \n", value1, value2, soma);

        var divisao = value1 / value2;

        System.out.printf("A operação de %s / %s é = %s \n", value1, value2, divisao);

        var porcentagem = value1 % value2;
        System.out.printf("A operação de %s %% %s é = %s \n", value1, value2, porcentagem);

        var raizQuadrada = Math.sqrt(value1);
        System.out.printf("A operação de %s^2 é = %s \n", value1, raizQuadrada);

    }
}
