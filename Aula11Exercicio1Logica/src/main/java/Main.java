import java.util.Scanner;

public class Main {

    public static void main (String args[]) {

        System.out.println("\f");

        Scanner scanner = new Scanner(System.in);

        Apple apple = new Apple();
        System.out.println("What's the color of the apple? ");
        apple.setColor(scanner.next());
        System.out.println(apple);

        Bergamot bergamot = new Bergamot();
        System.out.println("\nWhat's the color of the bergamot?");
        bergamot.setColor(scanner.next());
        System.out.println(bergamot);

        Orange orange = new Orange();
        System.out.println("\nWhat's the color of the orange?");
        orange.setColor(scanner.next());
        System.out.println(orange);

    }

}