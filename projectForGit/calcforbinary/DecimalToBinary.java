package calcforbinary;

public class DecimalToBinary {

    public String toBinary(String decimal) {
        String result = Integer.toBinaryString(Integer.parseInt(decimal));
        return result;
    }
}
