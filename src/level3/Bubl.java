package level3;

public class Bubl {
    public static void main(String[] args) {
        int[] array = {548, 8, 2, 0, 70, 5, 677, 8, 9, 8, 8, 8, 8, 8, 9};
        boolean sort = false;
        while (!sort) {
            sort = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int t = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = t;
                    sort = false;
                }
            }
        }
        System.out.print("Sort array ");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
