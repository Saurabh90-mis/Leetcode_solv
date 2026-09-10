class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k>bloomDay.length){
            return -1;
        }
        int l=1, r=0;
        for(int i=0;i<bloomDay.length;i++){
            r=Math.max(bloomDay[i],r);
        }
        while(l<=r){
            int mid=l+(r-l)/2;
            if(isPossible(bloomDay,m,k,mid)){
                r=mid-1;
            }else{
                l=mid+1;
            }   

        }
        return l;
    }
    private boolean isPossible(int[] bloomDay, int m  ,int k,int target){
        int total=0, cnt=0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=target){
                cnt++;
                if(cnt==k){
                    total++;
                    cnt=0;
                }
            }else{
                cnt=0;
            }
            if(total>=m) return true;
        }
    return false;
    }
}