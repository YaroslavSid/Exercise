package level2;

public class Notcount {
    public static void main(String[] args) {
        int[] array = {4,5,3,8,9};
        int min=0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i]%2!=0) {
                min++;
            }
        }
        System.out.println("Sum element array with not count index = "+min);
    }
}
