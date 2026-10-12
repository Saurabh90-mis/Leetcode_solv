class Solution {
    public int resilientSubarray(int[] nums, int k) {
        int n=nums.length;
        int ans=1;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=nums[j];
                if(nums[j]%k!=nums[i]%k){
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