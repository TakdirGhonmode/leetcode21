public class PallindromeTest {
    static boolean solve(String s, int left, int right) {
        if (left >= right) {
            return true;
        }

        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }

        return solve(s, left + 1, right - 1);
    }

    public static void main(String[] args) {

        String[] testCases = {
            "madam",
            "racecar",
            "hello",
            "level",
            "java",
            "a",
            "",
            "abba",
            "abcba",
            "abcd"
        };
        for (String s : testCases) {
            boolean result = solve(s, 0, s.length() - 1);
            System.out.println(s + " -> " + result);
        }
    } 
}
