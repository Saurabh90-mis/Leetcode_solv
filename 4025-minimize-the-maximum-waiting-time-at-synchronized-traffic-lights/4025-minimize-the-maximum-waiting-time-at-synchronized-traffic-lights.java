class Solution {
    public int minPenalty(int period, int[] lights, int[] arrivalTime) {
        int max=0;
        for(int i=0;i<lights.length;i++){
            max=Math.max(max,lights[i]);
        }
            int[] val=arrivalTime;
            int ans=0;
            for(int j=0;j<arrivalTime.length;j++){
                int r=arrivalTime[j]%period;
                if(r>=max)
                    ans=Math.max(ans,period-r);
            }
            return ans;
        
    }
}