import java.util.HashMap;
public class RansomNote {

    public static boolean canConstruct(String ransomNote, String magazine) {

        // Store the frequency of each character
        HashMap<Character, Integer> map = new HashMap<>();

        // Count characters in the magazine
        for (char ch : magazine.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Check if ransom note can be formed
        for (char ch : ransomNote.toCharArray()) {

            // Character not available
            if (!map.containsKey(ch) || map.get(ch) == 0) {
                return false;
            }

            // Use one occurrence
            map.put(ch, map.get(ch) - 1);
        }

        return true;
    }

    public static void main(String[] args) {

        System.out.println("Test Case 1");
        System.out.println("Input : ransomNote = \"a\", magazine = \"b\"");
        System.out.println("Output: " + canConstruct("a", "b"));
        System.out.println();

        System.out.println("Test Case 2");
        System.out.println("Input : ransomNote = \"aa\", magazine = \"ab\"");
        System.out.println("Output: " + canConstruct("aa", "ab"));
        System.out.println();

        System.out.println("Test Case 3");
        System.out.println("Input : ransomNote = \"aa\", magazine = \"aab\"");
        System.out.println("Output: " + canConstruct("aa", "aab"));
        System.out.println();

        System.out.println("Test Case 4");
        System.out.println("Input : ransomNote = \"abc\", magazine = \"cbad\"");
        System.out.println("Output: " + canConstruct("abc", "cbad"));
        System.out.println();

        System.out.println("Test Case 5");
        System.out.println("Input : ransomNote = \"abcd\", magazine = \"abc\"");
        System.out.println("Output: " + canConstruct("abcd", "abc"));
        System.out.println();

        System.out.println("Test Case 6");
        System.out.println("Input : ransomNote = \"\", magazine = \"abc\"");
        System.out.println("Output: " + canConstruct("", "abc"));
        System.out.println();

        System.out.println("Test Case 7");
        System.out.println("Input : ransomNote = \"abc\", magazine = \"\"");
        System.out.println("Output: " + canConstruct("abc", ""));
        System.out.println();

        System.out.println("Test Case 8");
        System.out.println("Input : ransomNote = \"aabbcc\", magazine = \"abcabc\"");
        System.out.println("Output: " + canConstruct("aabbcc", "abcabc"));
    }
}
