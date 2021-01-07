package calcforbinary;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        DecimalToBinary toBinary = new DecimalToBinary();
        BinaryToDecimal toDecimal = new BinaryToDecimal();
        System.out.println("Select system translation");
        System.out.println("---------------------------------");
        System.out.println("1. Decimal -> Binary " + "\n2. Binary -> Decimal");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        switch (number){
            case 1:
                System.out.println("Put down");
                String decimal = scanner.nextLine();
                String result = toBinary.toBinary(decimal);
                System.out.println("number = " + result);
                break;
            case 2:
                System.out.println("Put down");
                Scanner scanner1 = new Scanner(System.in);
                String binary = scanner1.nextLine();
                String result1 = toDecimal.toDecimal(binary);
                System.out.println("number = " + result1);
                break;
            default:
                System.out.println("Choose number");
        }
        scanner.close();

    }
}
