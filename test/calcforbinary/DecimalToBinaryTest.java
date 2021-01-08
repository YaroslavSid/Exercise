package calcforbinary;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.junit.Assert.*;

public class DecimalToBinaryTest {
    DecimalToBinary binary = new DecimalToBinary();

    @Test
    public void toBinary() {
        String res = binary.toBinary("42");
        assertThat(res, CoreMatchers.is("101010"));
    }
}