package calcforbinary;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryToDecimalTest {
    BinaryToDecimal binaryToDecimal = new BinaryToDecimal();

    @Test
    public void toDecimal() {
        String res = binaryToDecimal.toDecimal("1111111111010110");
        assertThat(res, CoreMatchers.is("-42"));

    }
}