class PeakIndex {

  public static int peakIndex(int array[]) {

    int r = array.length - 1;
    int l = 0;

    int ans = -1;

    while (l < r) {

      int mid = l + (r - l) / 2;

      if (array[mid] < array[mid + 1]) {

        l = mid + 1;

      } else {

        ans = mid;
        r = mid;
      }
    }

    return (ans == -1) ? l : ans;
  }

  public static void main(String[] args) {

    int[] arr1 = { 1, 3, 5, 7, 6, 4, 2 };
    System.out.println(peakIndex(arr1));
    // Expected: 3

    int[] arr2 = { 1, 2, 3, 4, 5, 3, 1 };
    System.out.println(peakIndex(arr2));
    // Expected: 4

    int[] arr3 = { 0, 2, 4, 6, 5, 3, 1 };
    System.out.println(peakIndex(arr3));
    // Expected: 3
  }
}