package calcforbinary;

public class DecimalToBinary {
    public String toBinary(String decimal) throws NumberFormatException {
        String result = Integer.toBinaryString(Integer.parseInt(decimal));
        return result;
    }
}
