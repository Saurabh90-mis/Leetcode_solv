class Solution {
    public int minOperations(String s) {
       int n = s.length();
        char mn = 'z', mx = 'a';
        boolean sorted = true;
        int minCount = 0, maxCount = 0;

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (ch < mn) {
                mn = ch;
                minCount = 1;
            } else if (ch == mn) {
                minCount++;
            }

            if (ch > mx) {
                mx = ch;
                maxCount = 1;
            } else if (ch == mx) {
                maxCount++;
            }

            if (i > 0 && ch < s.charAt(i - 1)) {
                sorted = false;
            }
        }

        if (sorted) return 0;
        if (n == 2) return -1;

        if (s.charAt(0) == mn || s.charAt(n - 1) == mx) {
            return 1;
        }

        if (s.charAt(0) == mx && s.charAt(n - 1) == mn
                && minCount == 1 && maxCount == 1) {
            return 3;
        }

        return 2;
    }
}