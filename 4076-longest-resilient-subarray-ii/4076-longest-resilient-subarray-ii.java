class Solution {
    public int resilientSubarray(int[] nums, int k) {
        int n = nums.length;
        int l= 0, r= 0;
        long ans=0;
        int max= 0;
        while (r< n) { 
            if (nums[l]% k !=nums[r]%k) {
                l= r;
              
            }
           int len = r-l+1;
           

           if (((long)(len - 1) * (nums[r] % k)) % k == 0) {
                max = Math.max(max, len);
            }
            r++;
        }
        return max;
    }
}