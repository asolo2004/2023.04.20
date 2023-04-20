

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class SubstringFind {

   public static int find(String substring, String targetString) {
        int counter = 0;

        Pattern pattern = Pattern.compile("(?=" + Pattern.quote(substring) + ")");
        Matcher matcher = pattern.matcher(targetString);
        while (matcher.find()) {
            counter += 1;
        }
        return counter;
    }



}
