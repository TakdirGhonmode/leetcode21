import java.util.*;

public class Main {

    public static int solution(List<List<Integer>> triangle, int rowIndex, int columnIndex) {

        // Base case
        if (rowIndex == triangle.size() - 1) {
            return triangle.get(rowIndex).get(columnIndex);
        }

        // Move down
        int downAns = solution(triangle, rowIndex + 1, columnIndex);

        // Move diagonally
        int diagonalAns = solution(triangle, rowIndex + 1, columnIndex + 1);

        // Current value + minimum of both paths
        int ans = triangle.get(rowIndex).get(columnIndex)
                + Math.min(downAns, diagonalAns);

        return ans;
    }

    public static void main(String[] args) {

        List<List<Integer>> triangle = new ArrayList<>();

        triangle.add(Arrays.asList(2));
        triangle.add(Arrays.asList(3, 4));
        triangle.add(Arrays.asList(6, 5, 7));
        triangle.add(Arrays.asList(4, 1, 8, 3));

        int rowIndex = 0;
        int columnIndex = 0;

        int ans = solution(triangle, rowIndex, columnIndex);

        System.out.println("Minimum Path Sum = " + ans);
    }
}