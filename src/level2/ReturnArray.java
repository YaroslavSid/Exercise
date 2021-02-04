package level2;
import java.util.Arrays;

public class ReturnArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 2, 232, 432, 5324, 3};
        array[5-4]=8;
        for (int i = array.length - 1; i >= 0; i--);
        System.out.println((Arrays.toString(array)));


    }
}
