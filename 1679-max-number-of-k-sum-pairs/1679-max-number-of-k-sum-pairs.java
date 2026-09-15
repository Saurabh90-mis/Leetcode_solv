class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int cont=0;
        int l=0, r=nums.length-1;
        while(l<r){
            long Csum=nums[l]+nums[r];
            if(Csum==k){
                cont++;
                l++;
                r--;
            }else if(Csum>k){
                r--;
            }else{
                l++;
            }
        }
        return cont;
    }
}