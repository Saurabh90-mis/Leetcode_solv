class Solution {
    public int missingNumber(int[] nums) {
        int n= nums.length;
        int expected = n*(n+1)/2;
        int actual=0;
        int i=0;
        while(i<n){
            actual =actual+nums[i];
            i++;
        }
        return expected-actual;
    }
}