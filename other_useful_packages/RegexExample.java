/*
 * Regular Expressions
 * 
 * Java does not have a built-in Regular Expression class, but the 
 * java.util.regex package can work with them!
 * 
 * This package includes:
 *  - Pattern (class) -> defines a pattern (to be used in a search)
 *  - Matcher (class) -> used to search for the pattern
 *  - PatternSyntaxException (class) -> Indicates syntax error in a regex 
 *      pattern
 * 
 * Flags in the 'compile' method:
 *  - Pattern.CASE_INSENSITIVE -> case of letters ignored when performing search
 *  - Pattern.LITERAL -> special characters in the pattern will not have any
 *      special meaning and treated as ordinary characters
 *  - Pattern.UNICODE_CASE -> use with CASE_INSENSITIVE to also ignore letters
 *      outside of the English alphabet
*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {
        // This creates the pattern to search for using the compile method
        Pattern pattern = Pattern.compile("ur mom", Pattern.CASE_INSENSITIVE);

        // This returns a matcher object which contains information about the search
        Matcher matcher = pattern.matcher("I can't believe you told me a 'ur mom' joke!");

        // returns true if pattern was found, false otherwise
        if (matcher.find()) {
            System.out.println("Match found!");
        } else {
            System.out.println("Match not found.");
        }
    }
}
