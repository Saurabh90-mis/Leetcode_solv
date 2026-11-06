class Solution {
    public int[] diStringMatch(String s) {
        int n=s.length();
        int l=0, r=s.length();
        int[] res = new int[n+1];
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='I'){
                res[i]=l++;
            }else{
                res[i]=r--;
            }
        }
        res[n]=r;
        return res;
    }
}