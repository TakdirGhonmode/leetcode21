import java.util.*;

public class BloomDay{

    public static boolean helper(int[] b, int mid, int m, int k) {

        int adjFlower = 0;
        int bouquetsMade = 0;

        for (int i = 0; i < b.length; i++) {

            if (b[i] <= mid) {
                adjFlower++;

                if (adjFlower == k) {
                    bouquetsMade++;
                    adjFlower = 0;
                }

            } else {
                adjFlower = 0;
            }
        }

        return bouquetsMade >= m;
    }

    public static int minDays(int[] b, int m, int k) {

        if ((long) m * k > b.length) {
            return -1;
        }

        int min = b[0];
        int max = b[0];

        for (int day : b) {
            min = Math.min(min, day);
            max = Math.max(max, day);
        }

        int low = min;
        int high = max;

        while (low < high) {

            int mid = low + (high - low) / 2;

            if (helper(b, mid, m, k)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of flowers: ");
        int n = sc.nextInt();

        int[] bloomDay = new int[n];

        System.out.println("Enter bloom days:");
        for (int i = 0; i < n; i++) {
            bloomDay[i] = sc.nextInt();
        }

        System.out.print("Enter m (bouquets needed): ");
        int m = sc.nextInt();

        System.out.print("Enter k (flowers per bouquet): ");
        int k = sc.nextInt();

        int ans = minDays(bloomDay, m, k);

        System.out.println("Minimum days = " + ans);

        sc.close();
    }
}