import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner dado = new Scanner(System.in);

        var ii = 2;
        //primeiro argumento do for define o ponto de inicio, e segundo para definir o critério de parada do loop.
        //Aqui vamos percorrer a lista de argumentos do projeto (acessar Edit configuration no intellij pra editar os argumentos)
        for(var i = 0; i < args.length; i++){
            System.out.println( (i+1) + "-" + args[i]);

        }
    }
    }