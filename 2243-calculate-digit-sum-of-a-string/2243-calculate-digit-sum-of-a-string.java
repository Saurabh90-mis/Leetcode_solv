class Solution {
    public String digitSum(String s, int k) {
        int count = k;
        int sumv = 0;

        while (s.length() > k) {
            String ans = "";

            for (int i = 0; i < s.length(); i++) {
                sumv += s.charAt(i) - '0';
                count--;

                if (count == 0 || i == s.length() - 1) {
                    count = k;
                    ans = ans + sumv;
                    sumv = 0;
                }
            }

            s = ans;
        }

        return s;
    }
}