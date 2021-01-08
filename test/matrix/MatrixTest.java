package matrix;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixTest {
    Matrix matrix = new Matrix();

    @Test
    public void sumMatrix() {
        int[][] value1 = {{-1, 2, 4},
                {112, 312, 23},
                {1, 1, 1}};
        int[][] value2 = {{1, 2, 4},
                {112, 312, 23},
                {1, 1, 1}};
        int[][] expect = {{0, 4, 8},
                {224, 624, 46},
                {2, 2, 2}};
        int[][] res = matrix.sumMatrix(value1, value2);
        assertThat(res, CoreMatchers.is(expect));
    }
}