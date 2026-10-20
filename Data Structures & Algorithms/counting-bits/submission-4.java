class Solution {
    public int[] countBits(int n) {
        int[] output = new int[n + 1];

        for(int i = 0; i <= n; i++) {
            int k = i, ones = 0;
            while(k > 0) {
                ones += k & 1;
                k >>= 1;
            }
            output[i] = ones;
        }

        return output;
    }
}
