import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GermanStyleDateChecker {
    public static Matcher getMatcher(String dateString) {

        final String regex = "^((0?\\d)|((1|2)\\d)|(3(0|1)))" +
                "(\\s|\\-|\\.)" +
                "((0?\\d)|(1\\d[0-2]))" +
                "(\\s|\\-|\\.)" +
                "((19|20)?\\d\\d)$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(dateString);
        return matcher;
    }
}
