class Solution {
    public int minimumK(int[] nums) {
        int l= 1, r=100000;

        for(int i =0;i <nums.length;i++){
            r =Math.max(r,nums[i]);
        }

        int ans =r;

        while(l <=r){
            int mid=l+(r-l)/2;
            long sum=0;
            for(int i =0;i <nums.length;i++){
                sum +=(nums[i] +mid -1)/ mid;
            }

            if(sum <=(long)mid*mid){
                ans =mid;
                r= mid -1;
            }else{
                l=mid + 1;
            }
        }

        return ans;
    }
}