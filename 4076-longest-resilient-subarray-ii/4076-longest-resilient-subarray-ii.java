class Solution {
    public int resilientSubarray(int[] nums, int k) {
               int n = nums.length;
        int prevMod = nums[0] % k;
        int l = 0;
        int max = 1;

        for (int r = 1; r < n; r++) {
            if (nums[r] % k == prevMod) {
                if (((long)(r - l) * prevMod) % k == 0) {
                    max = Math.max(max, r - l + 1);
                }
            } else {
                prevMod = nums[r] % k;
                l = r;
            }
        }

        return max;
    }
}