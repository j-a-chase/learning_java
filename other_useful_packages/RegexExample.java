/*
 * Regular Expressions
 * 
 * Java does not have a built-in Regular Expression class, but the 
 * java.util.regex package can work with them!
 * 
 * This package includes:
 *  - Pattern (class) -> defines a pattern (to be used in a search)
 *  - Matcher (class) -> used to search for the pattern
 *  - PatternSyntaxException (class) -> Indicates syntax error in a regex pattern
*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("ur mom", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("I can't believe you told me a 'ur mom' joke!");

        if (matcher.find()) {
            System.out.println("Match found!");
        } else {
            System.out.println("Match not found.");
        }
    }
}
