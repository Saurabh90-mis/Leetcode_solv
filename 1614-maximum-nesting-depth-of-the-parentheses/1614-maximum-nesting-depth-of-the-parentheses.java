class Solution {
    public int maxDepth(String s) {
       int ans=0;
       int open=0;
        for(int i=0;i<s.length();i++){
            char c =s.charAt(i);
            if(c=='('){
                open++;
            }else if(c==')'){
                open--;
            }
            ans=Math.max(ans, open);
        }
        return ans;
    }
}