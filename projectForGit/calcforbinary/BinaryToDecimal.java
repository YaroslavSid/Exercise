package calcforbinary;


public class BinaryToDecimal {
    public String toDecimal(String binary) throws NumberFormatException {
        int n ;
        int num ;
        String s = null;
        if (binary.charAt(0) == '1') {
            StringBuilder stringBuilder = new StringBuilder();

            for (int i = 0; i < binary.length(); i++) {
                stringBuilder.append((binary.charAt(i) == '1' ? '0' : '1'));
                s = stringBuilder.toString();
            }
            n = Integer.parseInt(s, 2);
            num = (n + 1) * (-1);
            return String.valueOf(num);
        } else {
            int parseInt =  Integer.parseInt(binary, 2);
            return String.valueOf(parseInt);

        }
    }
}
