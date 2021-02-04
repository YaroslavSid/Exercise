package level2;

public class Sum {
    public static void main(String[] args) {
        int[] array = {54, 9, 0, 70, 5, -677, 9, 7 ,8 ,9 ,10};
        int min=0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i]%2==0) {
                min++;
            }
        }
        System.out.println("Sum element array with odd index = "+min);
    }
}
