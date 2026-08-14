import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Substring {
    public static void getAllSubString(String s, int index,
                                       StringBuilder op,
                                       List<String> ans){
        // Base case: when all characters have been processed
        if (index == s.length()) {

            // Convert StringBuilder to String
            String subString = op.toString();

            // Store the generated substring
            ans.add(subString);

            return;
        }

        // Include the current character

        char c = s.charAt(index);

        op.append(c);

        getAllSubString(s, index + 1, op, ans);

        // Backtracking:
        // Remove the previously added character
        op.deleteCharAt(op.length() - 1);

        // Exclude the current character

        getAllSubString(s, index + 1, op, ans);
    }

    public static void main(String[] args) {

        String s = "abc";

        List<String> ans = new ArrayList<>();
        StringBuilder op = new StringBuilder();
        int index = 0;
        getAllSubString(s, index, op, ans);
        Collections.sort(ans);
        System.out.println(ans);
    }
}