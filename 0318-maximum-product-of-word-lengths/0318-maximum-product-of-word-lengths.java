class Solution {
    public int maxProduct(String[] words) {
        int max = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                int a = words[i].length();
                int b = words[j].length();
                boolean[] ar = new boolean[26];
                for (int k = 0; k < words[i].length(); k++) {
                    ar[words[i].charAt(k) - 'a'] = true;
                }
                boolean val = true;
                for (int k = 0; k < words[j].length(); k++) {
                    if (ar[words[j].charAt(k) - 'a']) {
                        val = false;
                        break;
                    }
                }

                if (val) {
                    max = Math.max(max, a * b);
                }
            }
        }
        return max;
    }
}
