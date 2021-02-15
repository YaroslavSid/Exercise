package csv_file;

import java.io.*;
import java.util.Scanner;

public class Generator {
    public static void main(String[] args) throws IOException {
        Doc doc = new Doc();
        System.out.println("Directory to save(" +
                "Example: C:\\Users\\Yarik\\project\\src\\csv_file):");
        Scanner scanner = new Scanner(System.in);
        String space = scanner.nextLine();
        String file = space.trim();    //if add space in start at the beginning of the line

        System.out.println("Maximum number of  line:");
        Scanner scanner1 = new Scanner(System.in);
        long max_value = scanner1.nextInt();

        doc.entities(file,max_value);
        doc.taxonomies(file,max_value);
        doc.types(file,max_value);
        doc.properties(file,max_value);
        doc.property_definition(file,max_value);

        System.out.println("--------------------------");
        System.out.println("done");
        scanner.close();
        scanner1.close();
    }
}

