class Solution {
    public long maximumScore(int[] nums) {
        long sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int n=nums.length;
        long ans=Long.MIN_VALUE;
        int mini=Integer.MAX_VALUE;
        for(int i=n-1;i>=1;i--){
            sum-=nums[i];
            mini=Math.min(mini,nums[i]);
            ans=Math.max(ans,sum-mini);
        }
        return ans;
    }
}