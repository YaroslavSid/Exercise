import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Text {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\b\\w+\\b");
        Matcher m = p.matcher("Congratulations on making \n     the wise decision      to        learn another language!\n This decision will help you throughout the rest of your life.");
        while (m.find())System.out.print(m.group() + " , ");

    }
}
