class Solution {
    public int resilientSubarray(int[] nums, int k) {
        int n=nums.length;
        int ans=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=nums[j];
                int rem=nums[i]%k;
                if(nums[j]%k!=rem){
                    break;
                }
                 if ((sum - nums[i]) % k == 0 &&
                    (sum - nums[j]) % k == 0) {
                    ans = Math.max(ans, j-i+1);
                }
            }
        }
        return ans;
    }
}