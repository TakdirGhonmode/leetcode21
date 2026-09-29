public class Grid {
    public static void dfs(int[][] grid, int row, int col) {
        if (row < 0 || col < 0 || row >= grid.length || col >= grid[0].length) {
            return;
        }
        // already visited
        if (grid[row][col] == 0) {
            return;
        }
        // visite
        grid[row][col] = 0;
        // up
        dfs(grid, row - 1, col);
        // down
        dfs(grid, row + 1, col);
        // left
        dfs(grid, row, col - 1);
        // right
        dfs(grid, row, col + 1);
    }

    public static int countIslands(int[][] grid) {
        int count = 0;
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                if (grid[row][col] == 1) {
                    count++;
                    dfs(grid, row, col);
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int[][] grid = {
                { 1, 1, 0 },
                { 1, 0, 0 },
                { 0, 0, 1 }
        };

        System.out.println(countIslands(grid));
    }
}
