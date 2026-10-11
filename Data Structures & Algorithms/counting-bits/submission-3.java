class Solution {
    public int[] countBits(int n) {
        int[] count = new int[n + 1];
        for(int i = 0; i <= n; i++) {
            int tmp = i;
            while(tmp > 0) {
                count[i] += tmp & 1;
                tmp >>= 1;
            }
        }

        return count;
    }
}
