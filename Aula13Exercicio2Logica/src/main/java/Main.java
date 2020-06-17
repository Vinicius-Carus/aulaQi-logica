import java.util.Scanner;

/**
 * @author Vinicius Carus
 * @version 1.0
 * @since 30/05/2020 16:08
 */
public class Main {

    public static void main (String args[]) {

        System.out.println("\f");

        Scanner scanner = new Scanner(System.in);

        Month month = new Month();
        System.out.println("Choose a month number: ");
        month.setNumberOfMonth(scanner.nextInt());
        System.out.println(month);

    }

}