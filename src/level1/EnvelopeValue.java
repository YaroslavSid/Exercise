package level1;

import java.util.Objects;

public class EnvelopeValue {
    private final int a;
    private final int b;
    private final int d;
    private final int c;


    EnvelopeValue(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public String toString() {
        return "EnvelopeValue{" +
                "a=" + a +
                ", b=" + b +
                ", d=" + d +
                ", c=" + c +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EnvelopeValue that = (EnvelopeValue) o;
        return a == that.a &&
                b == that.b &&
                d == that.d &&
                c == that.c;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, d, c);
    }
}
