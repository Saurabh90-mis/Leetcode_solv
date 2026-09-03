class Solution {
    public boolean uniformArray(int[] nums1) {
        int mini = Integer.MAX_VALUE;
        int cnt = 0;
        for (int i = 0; i < nums1.length; i++) {
            mini = Math.min(mini, nums1[i]);
            if (nums1[i] % 2 == 1)
                cnt++;
        }
        if (mini % 2 != 0)
            return true;
        if (cnt == 0)
            return true;
        return false;

    }
}