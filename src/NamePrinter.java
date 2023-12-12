import java.util.Scanner;

public class NamePrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a name: ");
        String name = scanner.next();

        System.out.println("Printing each letter of the name:");

        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }

        scanner.close();
    }
}
