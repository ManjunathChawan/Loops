import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        int a = 0, b = 1;
        int i = 0;

        System.out.println("Fibonacci Series up to n=" + n + ":");
        System.out.println("0");

        do {
            System.out.println(b);
            int temp = a + b;
            a = b;
            b = temp;
            i++;
        } while (i < n);

        scanner.close();
    }
}
