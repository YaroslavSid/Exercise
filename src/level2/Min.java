package level2;

public class Min {
    public static void main(String[] args) {
        int[] array = {54, 2, 0, 70, 5, -677, 8, 9, 8, 8, 9};
        int min = array[0];
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Min value = " + min);
    }
}