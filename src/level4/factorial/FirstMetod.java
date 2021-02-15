package tasts.factorial;

public class FirstMetod {
    public  int fack(int number) {
        if (number <= 1) {
            return 1;
        }
        return number * fack(number - 1);
    }
}
