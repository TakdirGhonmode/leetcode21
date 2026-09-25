import java.util.ArrayList;
import java.util.Collections;

public class Permutation{

    public static void solve(String s, String output, ArrayList<String> ans) {

        // Base case
        if (s.isEmpty()) {
            ans.add(output);
            return;
        }

        // Pick each character one by one
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // Remove the selected character
            String remains = s.substring(0, i) + s.substring(i + 1);

            // Recursive call
            solve(remains, output + ch, ans);
        }
    }

    public static ArrayList<String> permutation(String s) {

        ArrayList<String> ans = new ArrayList<>();

        solve(s, "", ans);

        Collections.sort(ans);

        return ans;
    }

    public static void main(String[] args) {

        String s = "ABC";

        ArrayList<String> ans = permutation(s);

        System.out.println("Permutations:");

        for (String str : ans) {
            System.out.println(str);
        }
    }
}