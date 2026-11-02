class Solution {
    public int minMoves2(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int median=0;
        int cnt=0;
        if(n%2==0){
            median=(nums[n/2]+nums[(n/2)-1])/2;

        }else{
            median=nums[n/2];
        }
        for(int i=0;i<n;i++){
            cnt+=Math.abs(median-nums[i]);
        }
        return cnt;
    }
}