import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationWD{

    public static void solve(int[] arr, List<Integer> output, boolean[] used) {

        if (output.size() == arr.length) {
            System.out.println(output);
            return;
        }

        for (int i = 0; i < arr.length; i++) {

            if (used[i]) {
                continue;
            }

            // Skip duplicate at the same level
            if (i > 0 && arr[i] == arr[i - 1] && !used[i - 1]) {
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

        int[] arr = {1, 1, 2};

        Arrays.sort(arr);

        List<Integer> output = new ArrayList<>();
        boolean[] used = new boolean[arr.length];

        solve(arr, output, used);
    }
}