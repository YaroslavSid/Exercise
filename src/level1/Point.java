package level1;

public class Point {
    public static void main(String[] args) {
        findOut(0, 0);
    }
    public static void findOut(int x, int y) {
        if (x > 0 & y > 0) {
            System.out.println("Qr.#1 ");
        } else if (x < 0 & y > 0) {
            System.out.println("Qr.#2 ");
        } else if (x < 0 & y < 0) {
            System.out.println("Qr.#3 ");
        } else if (x > 0 & y < 0) {
            System.out.println("Qr.#4 ");
        } else if (x == 0 & y > 0 | y < 0) {
            System.out.println("Lies on the coordinates Y ");
        } else if (x > 0 | x < 0) {
            System.out.println("Lies on the coordinates X ");
        } else {
            System.out.println("Point 0");
        }
    }

}
