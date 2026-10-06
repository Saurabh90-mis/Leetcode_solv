class Solution {
    public int minimizeSum(int[] nums) {
         int m = nums.length;

        Arrays.sort(nums);

        int a = nums[m - 1] - nums[2];
        int b = nums[m - 3] - nums[0];
        int c = nums[m - 2] - nums[1];

        return Math.min(a, Math.min(b, c));
    }
}