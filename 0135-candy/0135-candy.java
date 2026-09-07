class Solution {
    public int candy(int[] ratings) {
        int n=ratings.length;
        int cnt=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=1;
        }
        for(int i=1;i<n;i++){
            if(ratings[i]>ratings[i-1]){
                arr[i]=arr[i-1]+1;
            }
        }
        for(int i=n-1;i>0;i--){
            if(ratings[i-1]>ratings[i]){
                arr[i-1]=Math.max(arr[i-1],arr[i]+1);
            }
            cnt+=arr[i-1];
        }
        return cnt+arr[n-1];
    }
}