class Solution {
    public int maxVowels(String s, int k) {
        int l=0, cnt=0,ans=0;
        for(int r=0;r<s.length();r++){
            if(s.charAt(r)=='a'||
            s.charAt(r)=='e'||
            s.charAt(r)=='i'||
            s.charAt(r)=='o'||
            s.charAt(r)=='u'){
                cnt++;
            }
            if(r-l+1==k){
                ans=Math.max(cnt,ans);
                if(s.charAt(l)=='a'||
                s.charAt(l)=='e'||
                s.charAt(l)=='i'||
                s.charAt(l)=='o'||
                s.charAt(l)=='u'){
                    cnt--;
                }
            l++;
            }
        }
        
        return ans;
    }
}