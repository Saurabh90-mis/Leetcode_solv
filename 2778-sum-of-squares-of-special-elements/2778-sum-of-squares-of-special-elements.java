class Solution {
    public int sumOfSquares(int[] nums) {
        int cnt=0;
        for(int i=1;i<=nums.length;i++){
            if(nums.length%i==0){
                cnt+=nums[i-1]*nums[i-1];
            }
        }
        return cnt;
    }
}