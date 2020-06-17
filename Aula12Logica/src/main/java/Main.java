import java.util.Scanner;

public class Main {

    public static void main (String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\f");

        Aluno aluno = new Aluno();
        System.out.println("Digite seu nome:");
        aluno.setNome(scanner.nextLine());
        System.out.println("Digite sua primeira nota: ");
        aluno.setNota1(scanner.nextDouble());
        System.out.println("Digite sua segunda nota: ");
        aluno.setNota2(scanner.nextDouble());
        System.out.println("Digite o numero total de aulas: ");
        aluno.setTotalDeAulas(scanner.nextInt());
        System.out.println("Em quantas aulas vc foi? ");
        aluno.setNumeroDePresencas(scanner.nextInt());
        System.out.println(aluno);

    }

}