package tasts;

import org.hamcrest.CoreMatchers;
import org.junit.Test;
import tasts.factorial.FirstMetod;

import static org.junit.Assert.*;

public class FactorialTest {
    FirstMetod firstMetod = new FirstMetod();

    @Test
    public void fack() {
        int value = firstMetod.fack(5);
        assertThat(value, CoreMatchers.is(120));
    }
}