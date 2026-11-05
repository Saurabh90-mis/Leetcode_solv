class Solution {
    public int minimumSwap(String s1, String s2) {
        int m=s1.length();
        int n =s2.length();

        int l=0,r=0;
        for(int i=m-1;i>=0;i--){
            if(s1.charAt(i)=='x' && s2.charAt(i)=='y'){
                l++;
            }else if(s1.charAt(i)=='y'&& s2.charAt(i)=='x'){
                r++;
            }
        }
        if(l%2!=r%2){
            return -1;
        }
        int ans= l/2+r/2;
        if(l%2==1){
            ans+=2;
        }
        return ans;
    }
}