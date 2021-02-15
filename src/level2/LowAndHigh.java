package level2;

import java.util.Arrays;

public class LowAndHigh {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 9, 42, 6, 5, 21, -7, 9, -42};
        System.out.println("Elements : " + Arrays.toString(arr));
        int base = 0;
        int gen = 0;
        for (int i = 0; i < arr.length; i++) {
            base += arr[i];
            gen = i;
        }
        gen = base / gen;
        System.out.println("Sum  all  element " + base);
        System.out.println("General value =" + gen);
        System.out.println("-------------------------");
        System.out.print("Result low = ");
        for (int j : arr) {
            if (j < gen) {
                System.out.print(j + " ");
            }

        }
        System.out.print("\nResult high = ");
        for (int i : arr) {
            if (i > gen) {
                System.out.print(i + " ");
            }

        }

    }
}
