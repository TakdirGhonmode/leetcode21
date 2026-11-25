public class SearchInRotatedSortedArray {

  public static int searchInRotatedSortedArray(int arr[], int target) {

      int low = 0;
      int high = arr.length - 1;

      while (low <= high) {

          int mid = low + (high - low) / 2;

          // Step 1: Target found
          if (arr[mid] == target) {
              return mid;
          }

          // Step 2: Check if left half is sorted
          if (arr[low] <= arr[mid]) {

              // Step 3: Check whether target lies in left sorted half
              if (arr[low] <= target && target < arr[mid]) {
                  high = mid - 1;
              } else {
                  low = mid + 1;
              }

          } else {

              // Step 4: Right half is sorted

              // Step 5: Check whether target lies in right sorted half
              if (arr[mid] < target && target <= arr[high]) {
                  low = mid + 1;
              } else {
                  high = mid - 1;
              }
          }
      }

      // Target not found
      return -1;
  }

  public static void main(String args[]) {

      int arr[] = {10, 20, 30, 40, 50, 60};
      int target = 20;

      int ans = searchInRotatedSortedArray(arr, target);

      System.out.println("Target found at index: " + ans);
  }
}