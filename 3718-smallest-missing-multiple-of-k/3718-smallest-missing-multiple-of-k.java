class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
        int m = k;

        int arr[] = new int[nums.length];
        int s = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % k == 0)
                arr[s++] = nums[i];
        }
        int i = 0;
        while (i < s) {
            while (i < s && arr[i] != m)
                i++;
            if (i == s)
                return m;
            m += k;
            i++;
        }
        return m;
    }
}