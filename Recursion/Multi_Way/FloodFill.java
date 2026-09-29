public class FloodFill {
    public static void dfs(int[][] image, int row, int col, int originalC, int newC) {
        if (row < 0 || col < 0 || row >= image.length || col >= image[0].length) {
            return;
        }
        if (image[row][col] != originalC) {
            return;
        }
        image[row][col] = newC;
        // up
        dfs(image, row - 1, col, originalC, newC);
        // down
        dfs(image, row + 1, col, originalC, newC);
        // left
        dfs(image, row, col - 1, originalC, newC);
        // right
        dfs(image, row, col + 1, originalC, newC);
    }

    public static int[][] floodFill(int[][] image, int row, int col, int newC) {
        int originalC = image[row][col];
        if (col == newC) {
            return image;
        }
        dfs(image, row, col, originalC, newC);
        return image;
    }

    public static void main(String[] args) {

        int[][] image = {
                { 1, 1, 2 },
                { 1, 2, 1 },
                { 2, 1, 1 }
        };

        floodFill(image, 0, 0, 3);

        for (int[] row : image) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
