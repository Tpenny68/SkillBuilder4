
/**
 * SkillBuilder5 is a class for completing the Skill
 * Builder 5 assignment in Java.
 *
 * @author <You>
 * @version 1.0
 */

public class SkillBuilder4 {
    /**
     * Finds the first substring that starts with 't' or 'T' and ends with 'y' or 'Y'.
     *
     * @param s The input string to search through
     * @return The first substring that matches the pattern, or an empty string if none found
     */
    public static String findTYPattern(String s) {
        // Define states
        final int START = 0;
        final int COLLECTING = 1;

        // Initialize variables
        int currentState = START;
        int startPos = -1;

        // Process each character in the string
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            switch (currentState) {
                case START:
                    // Look for 't' or 'T'
                    if (c == 't' || c == 'T') {
                        currentState = COLLECTING;
                        startPos = i;
                    }
                    break;

                case COLLECTING:
                    // Check if we found a 'y' or 'Y'
                    if (c == 'y' || c == 'Y') {
                        // Return the substring from start position to current position (inclusive)
                        return s.substring(startPos, i + 1);
                    }
                    // Note: We no longer update startPos when finding another 't' or 'T'
                    // We keep the original startPos until we find a 'y' or 'Y'
                    break;
            }
        }

        // No matching pattern found
        return "";
    }
}
