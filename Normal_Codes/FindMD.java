public class Main {

  // TreeNode class
  static class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
      this.val = val;
    }
  }

  // Solution
  static class Solution {

    public int maxDepth(TreeNode root) {

      // Base case
      if (root == null) {
        return 0;
      }

      // Find depth of left subtree
      int left = maxDepth(root.left);

      // Find depth of right subtree
      int right = maxDepth(root.right);

      // Return maximum depth
      return 1 + Math.max(left, right);
    }
  }

  public static void main(String[] args) {

    Solution solution = new Solution();

    // Test Case 1
    // 1
    // / \
    // 2 3
    TreeNode root1 = new TreeNode(1);
    root1.left = new TreeNode(2);
    root1.right = new TreeNode(3);

    System.out.println("Test Case 1: " + solution.maxDepth(root1));
    // Expected: 2

    // Test Case 2
    // 1
    // /
    // 2
    // /
    // 3
    TreeNode root2 = new TreeNode(1);
    root2.left = new TreeNode(2);
    root2.left.left = new TreeNode(3);

    System.out.println("Test Case 2: " + solution.maxDepth(root2));
    // Expected: 3

    // Test Case 3
    // Empty tree
    TreeNode root3 = null;

    System.out.println("Test Case 3: " + solution.maxDepth(root3));
    // Expected: 0

    // Test Case 4
    // Single node
    TreeNode root4 = new TreeNode(1);

    System.out.println("Test Case 4: " + solution.maxDepth(root4));
    // Expected: 1

    // Test Case 5
    // 1
    // \
    // 2
    // \
    // 3
    // \
    // 4
    TreeNode root5 = new TreeNode(1);
    root5.right = new TreeNode(2);
    root5.right.right = new TreeNode(3);
    root5.right.right.right = new TreeNode(4);

    System.out.println("Test Case 5: " + solution.maxDepth(root5));
    // Expected: 4

    // Test Case 6
    // 1
    // / \
    // 2 3
    // / \
    // 4 5
    TreeNode root6 = new TreeNode(1);
    root6.left = new TreeNode(2);
    root6.right = new TreeNode(3);
    root6.left.left = new TreeNode(4);
    root6.left.right = new TreeNode(5);

    System.out.println("Test Case 6: " + solution.maxDepth(root6));
    // Expected: 3

    // Test Case 7
    // 1
    // / \
    // 2 3
    // / \
    // 4 5
    // \ \
    // 6 7
    TreeNode root7 = new TreeNode(1);
    root7.left = new TreeNode(2);
    root7.right = new TreeNode(3);
    root7.left.left = new TreeNode(4);
    root7.left.left.right = new TreeNode(6);
    root7.right.right = new TreeNode(5);
    root7.right.right.right = new TreeNode(7);

    System.out.println("Test Case 7: " + solution.maxDepth(root7));
    // Expected: 4

    // Test Case 8
    // 1
    // /
    // 2
    // /
    // 3
    // /
    // 4
    // /
    // 5
    TreeNode root8 = new TreeNode(1);
    root8.left = new TreeNode(2);
    root8.left.left = new TreeNode(3);
    root8.left.left.left = new TreeNode(4);
    root8.left.left.left.left = new TreeNode(5);

    System.out.println("Test Case 8: " + solution.maxDepth(root8));
    // Expected: 5

    // Test Case 9
    // 1
    // / \
    // 2 3
    // / \
    // 4 5
    // / \
    // 6 7
    TreeNode root9 = new TreeNode(1);
    root9.left = new TreeNode(2);
    root9.right = new TreeNode(3);
    root9.left.left = new TreeNode(4);
    root9.left.right = new TreeNode(5);
    root9.left.left.left = new TreeNode(6);
    root9.left.left.right = new TreeNode(7);

    System.out.println("Test Case 9: " + solution.maxDepth(root9));
    // Expected: 4

    // Test Case 10
    // 1
    // / \
    // 2 3
    // / / \
    // 4 5 6
    // /
    // 7
    TreeNode root10 = new TreeNode(1);
    root10.left = new TreeNode(2);
    root10.right = new TreeNode(3);
    root10.left.left = new TreeNode(4);
    root10.right.left = new TreeNode(5);
    root10.right.right = new TreeNode(6);
    root10.right.left.left = new TreeNode(7);

    System.out.println("Test Case 10: " + solution.maxDepth(root10));
    // Expected: 4
  }
}