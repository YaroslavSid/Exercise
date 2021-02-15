package level1;

public class Envelope {
    public static void main(String[] args) {
        EnvelopeValue envelope1 = new EnvelopeValue(8, 4, 6, 6);
        EnvelopeValue envelope2 = new EnvelopeValue(5, 4, 6, 6);
        System.out.println("Can you put one envelope in another? " + envelope1.equals(envelope2));

    }
}

