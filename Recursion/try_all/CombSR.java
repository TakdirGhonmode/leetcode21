import java.util.*;
class CombSR {
  public void solve(int[] candidates, int target, int index,
      List<Integer> current,
      List<List<Integer>> ans) {

    // Target complete
    if (target == 0) {
      ans.add(new ArrayList<>(current));
      return;
    }

    // Invalid path
    if (target < 0 || index == candidates.length) {
      return;
    }

    // TAKE
    current.add(candidates[index]);

    solve(candidates,
        target - candidates[index],
        index,
        current,
        ans);

    // BACKTRACK
    current.remove(current.size() - 1);

    // NOT TAKE
    solve(candidates,
        target,
        index + 1,
        current,
        ans);
  }

  public List<List<Integer>> combinationSum(int[] candidates, int target) {

    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> current = new ArrayList<>();

    solve(candidates, target, 0, current, ans);

    return ans;
  }
}