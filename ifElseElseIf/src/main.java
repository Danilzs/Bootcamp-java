import java.util.Scanner;
public class main {

    public static void main(String[] args) {

        Scanner dado =  new Scanner(System.in);

        //Recebe o nome e a idade
        System.out.println("Digite seu nome: ");
        String nome = dado.next();
        System.out.println("Digite sua idade: ");
        int idade = dado.nextInt();

        //verifica se é emancipado
        System.out.println("Você é emancipado? s/n.");
        var isEmancipated = dado.next().equalsIgnoreCase("s");

        //se for maior de 18, pode dirigir.
        // Se for menor de 18, mas maior ou igual a 16, e emancipado, pode dirigir.
        // Se não atender nenhuma dessas condições, não poderá dirigir.
        if (idade >= 18) {
            System.out.printf("%s, você tem %s anos. Está permitido a dirigir. \n", nome, idade);
        }else if(idade >= 16 && isEmancipated){
            System.out.printf("%s, apesar de ter apenas %s anos, você é emancipado e permitido a dirigir.\n", nome, idade);
        }
        else {
            System.out.printf("%s, você tem %s anos. Você não é emancipado e não pode dirigir. \n", nome, idade);
        }
        System.out.println("Fim de execução!");

        //Outra forma de fazer isso:
        /*

        var canDrive = (idade>=18) || (idade >=16 && isEmancipated);

        if(canDrive){
            System.out.printf("Olá %s, você tem %s anos. Você pode dirigir!\n", nome, idade);
        } else{
            System.out.printf("Olá %s, você tem %s anos. Você não pode dirigir!\n", nome, idade);
        }

         */
    }
}
