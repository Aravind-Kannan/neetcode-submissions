class Solution {
    public int[] countBits(int n) {
        int[] count = new int[n + 1];

        for(int i = 0; i <= n; i++) {
            int cur = i;
            while(cur > 0) {
                count[i] += cur & 1;
                cur >>= 1;
            }
        }

        return count;
    }
}
