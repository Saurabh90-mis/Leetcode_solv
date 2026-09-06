class Solution {
    public int countGoodRotations(int[] nums) {
        int n=nums.length;
        long total=0;
        int half=n/2;
        for(int i=0;i<n;i++){
            total+=nums[i];
        }
        long window=0;
        for(int i=0;i<n/2;i++){
            window+=nums[i];
        }
        int ans=0;
        for(int i=0;i<n;i++){
            if(window>total-window) ans++;
            window-=nums[i];
            window+=nums[(i+half)%n];
        }
        return ans;
    }
}