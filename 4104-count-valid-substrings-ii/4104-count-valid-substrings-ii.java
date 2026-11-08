class Solution {
    public long countValidSubstrings(String s) {
       int n = s.length();
        int a = -1, b = -1,c=-1;
        long ans = 0;

        for (int i = 0; i < n; i++) {
            char val = s.charAt(i);

            if (val == 'a'){ a = i;}
            else if (val == 'b') {b = a;}
            else {
                c=b;
            }
            ans+=i-c;
        }

        return ans;
    }
}