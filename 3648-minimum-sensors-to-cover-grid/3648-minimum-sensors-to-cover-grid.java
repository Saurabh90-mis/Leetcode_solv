class Solution {
    public int minSensors(int n, int m, int k) {
        int s=2*k+1;
         int r=(int)Math.ceil((double)n/s);
         int c=(int)Math.ceil((double)m/s);
    return r*c;
    }
}   