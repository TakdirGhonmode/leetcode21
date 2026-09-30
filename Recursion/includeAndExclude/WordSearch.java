public class WordSearch {
  public static boolean solve(char[][] board,
      String word, int row, int col, int index) {
    // the word is completed
    if (index == word.length()) {
      return true;
    }
    // going to the out of bound
    if (row < 0 || col < 0 || row >= board.length || col >= board[0].length) {
      return false;
    }
    // not match
    if (board[row][col] != word.charAt(index)) {
      return false;
    }
    // storing for the some time
    char origonal = board[row][col];
    // marks as the visited
    board[row][col] = '#';
    // if any one is true then go
    boolean found = solve(board, word, row + 1, col, index + 1)
        || solve(board, word, row - 1, col, index + 1)
        || solve(board, word, row, col - 1, index + 1) ||
        solve(board, word, row, col + 1, index + 1);
    // backtracking it
    board[row][col] = origonal;
    // return it the result
    return found;
  }

  public static boolean exist(char[][] board, String word) {

    for (int row = 0; row < board.length; row++) {
      for (int col = 0; col < board[0].length; col++) {
        if (solve(board, word, row, col, 0)) {
          return true;
        }
      }
    }
    return false;
  }

  public static void main(String[] args) {

    char[][] board = {
        { 'A', 'B', 'C', 'E' },
        { 'S', 'F', 'C', 'S' },
        { 'A', 'D', 'E', 'E' }
    };

    String word = "ABCCED";

    System.out.println(exist(board, word));
  }
}