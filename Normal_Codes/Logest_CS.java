public class Logest_CS {

    public static String longestCommonPrefix(String[] strs) {

        String prefix = strs[0];

        for (int j = 1; j < strs.length; j++) {

            String current = strs[j];

            int i = 0;

            while (i < prefix.length() &&
                    i < current.length() &&
                    prefix.charAt(i) == current.charAt(i)) {
                i++;
            }

            prefix = prefix.substring(0, i);

            if (prefix.equals("")) {
                return "";
            }
        }

        return prefix;
    }

    public static void main(String[] args) {

        // Test Case 1
        String[] strs1 = { "flower", "flow", "flight" };
        System.out.println("Test Case 1: " + longestCommonPrefix(strs1));

        // Test Case 2
        String[] strs2 = { "dog", "racecar", "car" };
        System.out.println("Test Case 2: " + longestCommonPrefix(strs2));

        // Test Case 3
        String[] strs3 = { "interspecies", "interstellar", "interstate" };
        System.out.println("Test Case 3: " + longestCommonPrefix(strs3));
    }
}