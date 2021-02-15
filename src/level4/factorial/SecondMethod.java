package tasts.factorial;

public class SecondMethod {
    FirstMetod firstMetod = new FirstMetod();
    public  void fackHigh(int value) {
        int firstResult = firstMetod.fack(15);
        int secondResult = 1;
        if (value == 16) {
            secondResult = 16;
        }
        for (int i = 16; i < value; i++) {
            secondResult = secondResult * i;
        }
//        System.out.println("FirstResult before 15 = " + firstResult + "\nSecondResult after " + secondResult);
        System.out.println("Need multiple two result = " + firstResult + " * " + secondResult);
//        System.out.println("Answer " + secondResult * firstResult);
    }
}
