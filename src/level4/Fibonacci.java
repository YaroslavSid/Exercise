package tasts.factorial;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(numberFibo(2));
        System.out.println(numberFibo(5));
        System.out.println(numberFibo(10));
        System.out.println(numberFibo(0));

    }
    public  static  int numberFibo (int number) {
        if (number<=1) {
            return number;
        }
        return numberFibo(number -1 ) + numberFibo( number - 2) ;
    }
}
