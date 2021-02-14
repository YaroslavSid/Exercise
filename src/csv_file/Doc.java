package csv_file;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Class contains methods for creating and writing to  file
 */
public class Doc {
    public void properties(String file, long max_value) throws FileNotFoundException {
        try (PrintWriter writer = new PrintWriter(file)) {
            writer.write("id," + "name," + "namespace," + "code," + "description," +
                    "value_type," + "value," + "uom," + "parent_id," + "entity_id");

            for (long i = 1L; i <= max_value; i++) {
                writer.write("\r");
                writer.write(String.valueOf(i));
                writer.write("," + "entity" + i + "," + "ns1," + i + ",,Integer," + i + ",pascal,," + i);
            }
        }
    }

    /* ----------------------------------------------------------------------------------------------- */

    public void property_definition(String file, long max_value) throws FileNotFoundException {
        try (PrintWriter writer = new PrintWriter(file)) {
            writer.write("id," + "name," + "namespace," + "code," + "description," +
                    "value_type," + "default_value," + "uom," + "parent_id," + "entity_id");

            for (long i = 1L; i <= max_value; i++) {
                writer.write("\r");
                writer.write(String.valueOf(i));
                writer.write("," + "entity" + i + "," + "ns1," + i + ",,Integer," + i + ",pascal,," + i);
            }
        }
    }

    /* ----------------------------------------------------------------------------------------------- */

    public void types(String file, long max_value) throws FileNotFoundException {
        try (PrintWriter writer = new PrintWriter(file)) {
            writer.write("id," + "name," + "namespace," + "code," + "description," +
                    "label," + "parent_id," + "classified_by_id");

            for (long i = 1L; i <= max_value; i++) {
                writer.write("\r");
                writer.write(String.valueOf(i));
                writer.write("," + "entity" + i + "," + "ns1," + i + ",,," + i + "," + "0");
            }
        }
    }

    /* ----------------------------------------------------------------------------------------------- */

    public void taxonomies(String file, long max_value) throws FileNotFoundException {
        try (PrintWriter writer = new PrintWriter(file)) {
            writer.write("id," + "name," + "code," + "namespace," + "description," + "parent_id");

            for (long i = 1L; i <= max_value; i++) {
                writer.write("\r");
                writer.write(String.valueOf(i));
                writer.write("," + "entity" + i + "," + i + "," + "ns1," + "," + i);
            }
        }
    }

    /* ----------------------------------------------------------------------------------------------- */

    public void entities(String file, long max_value) throws FileNotFoundException {
        try (PrintWriter writer = new PrintWriter(file)) {
            writer.write("id," + "name," + "namespace," + "code," + "description," + "label,"
                    + "parent_id," + "has_type_id");

            for (long i = 1L; i <= max_value; i++) {
                writer.write("\r");
                writer.write(String.valueOf(i));
                writer.write("," + "entity" + i + "," + "ns1," + i + ",,," + i + "," + i);
            }
        }
    }
}
