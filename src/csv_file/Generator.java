package csv_file;

import java.io.*;
import java.util.Scanner;

public class Generator {
    public static void main(String[] args) throws IOException {
        Doc doc = new Doc();
        long max_value;

        System.out.println("Choose file number:");
        System.out.println("1: entities.csv");
        System.out.println("2: taxonomies.csv");
        System.out.println("3: types.csv");
        System.out.println("4: properties.csv");
        System.out.println("5: property-definition.csv");

        try (Scanner scanner = new Scanner(System.in)) {
            String number = scanner.nextLine();
            int choice = Integer.parseInt(number);


            System.out.println("Directory and  name to save(" +
                    "Example: C:\\Users\\Yarik\\project\\src\\csv_file\\properties_test.csv ):");
            String space = scanner.nextLine();
            String file = space.trim();    //if add space in start at the beginning of the line


            System.out.println("Maximum number of  line:");
            Scanner scanner1 = new Scanner(System.in);
            max_value = scanner1.nextInt();

            switch (choice) {
                case 1:
                    doc.entities(file, max_value);
                    break;
                case 2:
                    doc.taxonomies(file, max_value);
                    break;
                case 3:
                    doc.types(file, max_value);
                    break;
                case 4:
                    doc.properties(file, max_value);
                    break;
                case 5:
                    doc.property_definition(file, max_value);
                    break;

            }
            System.out.println("--------------------------");
            System.out.println("done");
        }
    }
}
