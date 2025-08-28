import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner dado = new Scanner(System.in);
        var name = "";

        //While continuará o loop enquanto determinada condição não for atingida.
        // No caso de baixo, ele só para se for digitado exit.

        /*
        while(!name.equals("exit")){

            System.out.println("Informe um nome!");
            name = dado.next();
            System.out.println(name);
        }

         */

        do{
            System.out.println("Informe um nome!");
            name = dado.next();
            System.out.println(name);

            if(name.equalsIgnoreCase("exit")) break;

        } while (true);

        }
    }
