package tasts.factorial;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        SecondMethod  secondMethod = new SecondMethod();
        FirstMetod firstMetod = new FirstMetod();
        System.out.println("Put down number");
        System.out.println("If number > 15 -> take calculator");

        try (Scanner scanner = new Scanner(System.in)) {
            int number = scanner.nextInt();
            if (number <= 16 & number >= 1) {
                int value = firstMetod.fack(number);
                System.out.println(value);
            }
            if (number == 0) {
                System.out.println("1");
            }
            if (number >= 16) {
                secondMethod.fackHigh(number);
            }
        } catch (InputMismatchException e) {
            System.out.println(e + " -> Whole number ");
        } catch (StackOverflowError e) {
            System.out.println(e + " -> Put down positive");
        }
    }




}
