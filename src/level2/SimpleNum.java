package level2;
import java.util.Scanner;

public class SimpleNum {
    static int var = 2;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        number(n);
    }
    private static void number(int n) {
        if (n > 1) {
            if (n % var != 0) {
                var++;
                number(n);
            } else if (n % var == 0) {
                printIsItNaturalNumber(var, n);
            }
        }
    }
    private static void printIsItNaturalNumber(int var, int n) {
        if (var == n) {
            System.out.println(n + " is a natural number.");
        } else {
            System.out.println(n + " is not a natural number.");
        }
    }
}
