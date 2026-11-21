import java.util.Arrays;
class Closet_k {

    public static int[] kClosest(int[] arr, int k, int target) {

        int low = 0;
        int high = arr.length - k;

        while (low < high) {

            int mid = low + (high - low) / 2;

            if (target - arr[mid] > arr[mid + k] - target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = arr[low + i];
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};
        int target = 2;
        int k = 3;

        int[] result = kClosest(arr, k, target);

        System.out.println(Arrays.toString(result));
    }
}
