import java.util.Scanner;

///  Trabalhando o uso básico de get e set, usando classe Java.

public class Main {
    public static void main(String[] args) {

        Scanner dado = new Scanner(System.in);

        var male = new Persona();

        System.out.println("Digite seu nome: ");
        male.setName(dado.next());
        System.out.println("Digite sua idade: ");
        male.setAge(dado.nextInt());

        System.out.printf("Olá, %s! Você tem %s anos!\n", male.getName(), male.getAge());


        }
    }
