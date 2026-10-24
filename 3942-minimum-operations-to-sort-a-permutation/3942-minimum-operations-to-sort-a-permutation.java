class Solution {
    public int minOperations(int[] nums) {
        int n=nums.length;
        if(n==1 ){ return 0;}
        int l=0;
        while(nums[l]!=0){ l++;}

        boolean asc=true;
        boolean des=true;
        for(int i=1;i<n;i++){
            int val=nums[(l+i)%n];
            if(val!=i){
                asc=false;
            }
            if(val!=n-i){
                des=false;
            }
            if(!asc&& !des){
                return -1;
            }
        }
        if(asc){
            return Math.min(l,n-l+2);
        }
        return Math.min(n-l,l+2);
    }
}