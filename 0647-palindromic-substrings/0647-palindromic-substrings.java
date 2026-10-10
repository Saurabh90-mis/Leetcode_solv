class Solution {
    public int countSubstrings(String s) {
        int res=0;
        for(int i=0;i<s.length();i++){
            res+=isPalindrome(s,i,i);
            res+=isPalindrome(s,i,i+1);
        }
        return res;
    }
    private int isPalindrome(String s, int l , int r){
        int cnt=0;
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            r++;
            cnt++;
            l--;
        }
        return cnt;
    }
}