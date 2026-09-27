import java.util.*;
public class PermutationR {
    public static void solve(int[] arr, List<Integer> output, boolean[] used) {
        if (output.size() == arr.length) {
            System.out.println(output);
            return;
        }

        for (int i = 0; i < arr.length; i++) {

            if (used[i]) {
                continue;
            }

            // PICK
            output.add(arr[i]);
            used[i] = true;

            solve(arr, output, used);

            // BACKTRACK
            output.remove(output.size() - 1);
            used[i] = false;
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};

        List<Integer> output = new ArrayList<>();
        boolean[] used = new boolean[arr.length];

        solve(arr, output, used);
    }
}
