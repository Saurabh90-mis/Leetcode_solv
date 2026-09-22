class Solution {
    public int threeSumClosest(int[] nums, int target) {
Arrays.sort(nums);
        int result = nums[0]+ nums[1]+ nums[2];
        int minDiff= Integer.MAX_VALUE;

        for(int i=0;i<nums.length -2;i++){
            int low =i+1, high = nums.length -1;
            while(low < high){
                int sum = nums[i]+ nums[low]+ nums[high];
                if(sum == target)
                    return target;
                if(sum< target)
                    low++;
                else
                    high--;
                
                int diffTotarget = Math.abs(sum - target);
                if(diffTotarget < minDiff){
                    result = sum;
                    minDiff = diffTotarget;
                }
            }
        }
        return result;
    }
}