package calcforbinary;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        DecimalToBinary toBinary = new DecimalToBinary();
        BinaryToDecimal toDecimal = new BinaryToDecimal();
        System.out.println("Select system translation");
        System.out.println("---------------------------------");
        System.out.println("1. Decimal -> Binary " + "\n2. Binary -> Decimal");
        try (Scanner scanner = new Scanner(System.in)) {
            String number = scanner.nextLine();
            switch (number) {
                case "1":
                    System.out.println("Put down");
                    String decimal = scanner.nextLine();
                    String result = toBinary.toBinary(decimal);
                    System.out.println("number = " + result);
                    break;
                case "2":
                    System.out.println("Put down");
                    String binary = scanner.nextLine();
                    String result1 = toDecimal.toDecimal(binary);
                    System.out.println("number = " + result1);
                    break;
                default:
                    System.out.println("Choose number");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
