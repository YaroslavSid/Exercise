import java.util.Scanner;

public class SystemNum {
    public static void main(String[] args) {
        System.out.println("Select system translation");
        System.out.println("---------------------------------");
        System.out.println("1. Decimal -> Binary " + "\n2. Binary -> Decimal");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println();

        switch (number) {
            case 1:
                System.out.println("Put down");
                int decimal = scanner.nextInt();
                System.out.println("number = " + Integer.toBinaryString(decimal));
                break;
            case 2:
                System.out.println("Put down");
                Scanner scan = new Scanner(System.in);
                String binary = scan.nextLine();
                int n = 0;
                if(binary.charAt(0) == '1' ){
                    StringBuilder stringBuilder = new StringBuilder();

                    for (int i=0; i<binary.length(); i++) {
                        stringBuilder.append((binary.charAt(i) == '1' ? '0' : '1'));
                        String s = stringBuilder.toString();
                         n = Integer.parseInt(s, 2);
                    }n = (n+1) *(-1);
                        System.out.println(n);
                }else {
                    System.out.println("number = " + Integer.parseInt(binary, 2));

                }
                break;
            default:
                System.out.println("Choose number");
        }
        scanner.close();
    }
}
