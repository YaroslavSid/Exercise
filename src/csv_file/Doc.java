package csv_file;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Class contains methods for creating and writing to  file
 */
public class Doc {


    private long random_method(long max) {
        return 1 + (long) (Math.random() * max);
    }

    // all methods have  similar structure!!!
    public void properties(String file, long max_value) throws FileNotFoundException {
        /*
        using StringBuilder for add name file
         */
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder directory = stringBuilder.append(file).append("\\properties.csv");
        try (PrintWriter writer = new PrintWriter(String.valueOf(directory))) {       //return to String
            writer.write("id," + "name," + "namespace," + "code," + "description," +
                    "value_type," + "value," + "uom," + "parent_id," + "entity_id");

            for (long i = 1L; i <= max_value; i++) {         //CHECK OUT!
                writer.write("\r");
                writer.write(String.valueOf(i));
                writer.write("," + "entity" + i + "," + "ns1," + i + ",,Integer," + i + ",pascal," +
                        random_method(max_value) + "," + random_method(max_value));
            }
        }
    }

    /* ----------------------------------------------------------------------------------------------- */

    public void property_definition(String file, long max_value) throws FileNotFoundException {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder directory = stringBuilder.append(file).append("\\property_definition.csv");
        try (PrintWriter writer = new PrintWriter(String.valueOf(directory))) {
            writer.write("id," + "name," + "namespace," + "code," + "description," +
                    "value_type," + "default_value," + "uom," + "parent_id," + "entity_id");
            for (long i = 1L; i <= max_value; i++) {
                writer.write("\r");
                writer.write(String.valueOf(i));
                writer.write("," + "entity" + i + "," + "ns1," + i + ",,Integer," + i + ",pascal,"
                        + random_method(max_value) + ","+ random_method(max_value));
            }
        }
    }

    /* ----------------------------------------------------------------------------------------------- */

    public void types(String file, long max_value) throws FileNotFoundException {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder directory = stringBuilder.append(file).append("\\types.csv");
        try (PrintWriter writer = new PrintWriter(String.valueOf(directory))) {
            writer.write("id," + "name," + "namespace," + "code," + "description," +
                    "label," + "parent_id," + "classified_by_id");

            for (long i = 1L; i <= max_value; i++) {
                writer.write("\r");
                writer.write(String.valueOf(i));
                writer.write("," + "entity" + i + "," + "ns1," + i + ",,," + random_method(max_value)
                        + "," + random_method(max_value));
            }
        }
    }

    /* ----------------------------------------------------------------------------------------------- */

    public void taxonomies(String file, long max_value) throws FileNotFoundException {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder directory = stringBuilder.append(file).append("\\taxonomies.csv");
        try (PrintWriter writer = new PrintWriter(String.valueOf(directory))) {
            writer.write("id," + "name," + "code," + "namespace," + "description," + "parent_id");

            for (long i = 1L; i <= max_value; i++) {
                writer.write("\r");
                writer.write(String.valueOf(i));
                writer.write("," + "entity" + i + "," + i + "," + "ns1," + "," + random_method(max_value));
            }
        }
    }

    /* ----------------------------------------------------------------------------------------------- */

    public void entities(String file, long max_value) throws FileNotFoundException {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder directory = stringBuilder.append(file).append("\\entities.csv");
        try (PrintWriter writer = new PrintWriter(String.valueOf(directory))) {
            writer.write("id," + "name," + "namespace," + "code," + "description," + "label,"
                    + "parent_id," + "has_type_id");

            for (long i = 1L; i <= max_value; i++) {
                writer.write("\r");
                writer.write(String.valueOf(i));
                writer.write("," + "entity" + i + "," + "ns1," + i + ",,,"
                        + random_method(max_value) + "," + random_method(max_value));
            }
        }
    }
}
