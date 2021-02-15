package level2;

public class Repeat {
    public static void main(String[] args) {
        int[] array = {548, 7, 8, 8, 10, 8, 9};
        int element = 0;
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            int tempElement = array[i];
            int tempCount = 0;
            for (int j : array) {
                if (j == tempElement) {
                    tempCount++;
                }
                if (tempCount > count) {
                    element = tempElement;
                    count = tempCount;
                }
            }
        }
        System.out.println("element " + element  + "\nrepeat  " + count);
    }
}

