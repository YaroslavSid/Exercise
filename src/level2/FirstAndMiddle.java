package level2;

public class FirstAndMiddle {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        out :for (int i = 0; i <= arr.length / 2; i++) {
            System.out.print(arr[i] + " ");
            if (arr[i] < arr.length / 2) {

                int i1 = arr.length/2;
                while (i1 > args.length) {
                    System.out.print(arr[i1] + " ");
                    arr[i1]++;
                    ++i1;
                    continue out;
                }
            }
        }
    }
}
