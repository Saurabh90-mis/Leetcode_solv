class Solution {
    public int minRange(int a, int b, int c) {
        while (true) {
            if (a + b < c) {
                c = a + b;
            } else if (b + c < a) {
                a = b + c;
            } else if (a + c < b) {
                b = c + a;
            } else {
                break;
            }
        }

        int high = Math.max(a, Math.max(b, c));
        int low = Math.min(a, Math.min(b, c));

        return high - low;
    }
}