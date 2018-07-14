public class Solution {
    public int searchInsert(int[] nums, int target) {
        if (nums == null) return 0;
        // for (int i = 0; i < nums.length; i++) {
        //     if (nums[i] >= target) {
        //         return i;
        //     }
        // }
        // return nums.length;
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 3, 5, 7};
        int result = solution.searchInsert(nums, 3);
        System.out.println(result);
    }
}
