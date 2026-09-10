public class CapacityToShip {
  public static boolean isPossible(int arr[], int days, int capacity) {
    int daysCount = 1;
    int currentCapacity = 0;
    for (int i = 0; i < arr.length; i++) {
        if (currentCapacity + arr[i] <= capacity) {
            currentCapacity += arr[i];
        } 
        else {
            daysCount++;

            if (daysCount > days || arr[i] > capacity) {
                return false;
            }
            currentCapacity = arr[i];
        }
    }
    return true;
}
public static int findCapacity(int arr[], int days) {
    int left = 0;
    int right = 0;
    // Find minimum possible capacity
    // and maximum possible capacity
    for (int i = 0; i < arr.length; i++) {
        left = Math.max(left, arr[i]);
        right += arr[i];
    }
    int ans = -1;
    while (left <= right) {
        int mid = left + (right - left) / 2;
        if (isPossible(arr, days, mid)) {
            // mid works, try smaller capacity
            ans = mid;
            right = mid - 1;
        } else {
            // mid doesn't work, need bigger capacity
            left = mid + 1;
        }
    }
    return ans;
}

public static void main(String[] args) {
    int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int days = 5;
    int answer = findCapacity(arr, days);
    System.out.println("Minimum Capacity = " + answer);
}
}
