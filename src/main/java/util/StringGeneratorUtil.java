package util;

/**
 * Generator Util
 */
public class StringGeneratorUtil {

    public static String generateString() {
        String alphabetsInUpperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String alphabetsInLowerCase = "abcdefghijklmnopqrstuvwxyz";
        // create a super set of all characters
        String allCharacters = alphabetsInLowerCase + alphabetsInUpperCase;
        // initialize a string to hold result
        StringBuffer randomString = new StringBuffer();
        // loop for 10 times
        for (int i = 0; i < 10; i++) {
            // generate a random number between 0 and length of all characters
            int randomIndex = (int)(Math.random() * allCharacters.length());
            // retrieve character at index and add it to result
            randomString.append(allCharacters.charAt(randomIndex));
        }
        return randomString.toString();
    }
}