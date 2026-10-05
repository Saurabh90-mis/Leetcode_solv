class Solution {
    public int scoreOfParentheses(String s) {
        int score =0, ans=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                ans++;
            }else{
                ans--;
                if(s.charAt(i-1)=='('){
                    score+=Math.pow(2,ans);
                }
            }
        }
        return score;
    }
}