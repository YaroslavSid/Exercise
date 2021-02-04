package level2;

import java.util.Arrays;

public class MaxIndex {
    public static void main(String[] args) {
        int[] array = {54, 2, 0, 70, 5, 677, 8, 9, 8, 8, 9};
        int max = array[0];
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) {
                System.out.println("Index with max value = " + i);
            }
        }
    }
}
