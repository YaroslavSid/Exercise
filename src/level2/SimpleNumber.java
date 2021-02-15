package level2;
import java.util.ArrayList;
import java.util.Arrays;


public class SimpleNumber {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        int[] arr = {1, 2, 3, 4};
        int [ ] copy = Arrays.copyOfRange(arr,2,4);
        int [] copy2 = Arrays.copyOfRange(arr,0,2);
        System.out.println(Arrays.toString(arr));
        for (int j : copy) {
            integers.add(j);
        }
        for (int j : copy2) {
            integers.add(j);
        }
        System.out.println(integers);
    }
}



//    int []a;
//        int i;
//        int b;
//        for ( i=0; i< arr.length/2; i++){
//            System.out.println(arr[i]);
//        }
//        for ( b=i; b< arr.length; b++){
//            System.out.println(arr[b]);
//        }
//        for (int j : copy2) {
//            integers.add(j);
//        }