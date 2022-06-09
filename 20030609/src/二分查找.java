public class 二分查找 {
    public static int binarySearch(int[] nums, int target) {
        if (null == nums || nums.length == 0) { return -1; }

        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) >> 1;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return nums[left] == target ? left : -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = binarySearch(arr, 6);
        System.out.println(n);
    }
}
