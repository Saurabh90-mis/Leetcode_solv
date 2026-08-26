class Solution {
    public int minOperations(String s) {
        int max=0;
        for(int i=0; i<s.length(); i++){
        char c=s.charAt(i);
    
        int dis=(26-(c-'a'))%26;
        max=Math.max(max,dis);
        }
        return max;
    }
}