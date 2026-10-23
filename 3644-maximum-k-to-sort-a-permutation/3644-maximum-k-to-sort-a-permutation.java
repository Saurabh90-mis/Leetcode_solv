class Solution {
    public int sortPermutation(int[] nums) {
        int n=nums.length;
        int res=-1;
        for(int i=0;i<n;i++){
            if(nums[i]==i){
                continue;
            }
            res &= nums[i];
        }
        return res==-1?0:res;
    }
}