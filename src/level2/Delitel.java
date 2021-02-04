package level2;

public class Delitel {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                count++;
                sum += i;
            }
        }
        System.out.println("Count " + count);
        System.out.println("Sum " + sum);


    }
}
