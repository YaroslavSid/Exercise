package level2;

public class Polindrom {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("caytr");
        StringBuilder s1 = new StringBuilder(s);
        s1.reverse();
        if (s.toString().equals(s1.toString())) {
            System.out.println("Polendrom");
        } else {
            System.out.println("Not");
        }
    }
}

