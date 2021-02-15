package level2;

public class Deq {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int i;
        out :for (i = 0; i <= arr.length / 2; i++) {
            System.out.print(arr[i] + " ");
            if (arr[i] < arr.length / 2) {
                for (int i1 = arr.length-1; i1 > i - 1; --i1) {
                    System.out.print(arr[i1] + " ");
                    arr[i1]--;
                    continue out;
                }
            }
        }
    }
}
