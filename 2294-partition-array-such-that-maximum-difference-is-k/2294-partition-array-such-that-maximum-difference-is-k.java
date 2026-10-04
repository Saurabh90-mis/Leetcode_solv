class Solution {
    public int partitionArray(int[] nums, int k) {
          Arrays.sort(nums);

        int count = 1;
        int i = 0;
        int j = 0;

        while(i < nums.length && j < nums.length) {
            if((nums[j] - nums[i]) > k) {
                count++;
                i = j;
            }
            j++;
        }

        return count;
    }
}