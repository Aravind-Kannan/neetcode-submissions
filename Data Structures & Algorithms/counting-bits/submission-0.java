class Solution {
    int count(int n) {
        int count = 0;
        while(n > 0)
        {
            if((n & 1) == 1) count++;
            n = n >> 1;
        }
        return count;
    }

    public int[] countBits(int n) {
        int[] output = new int[n + 1];

        for(int i = 0; i <= n; i++)
        {
            output[i] = count(i);
        }

        return output;
    }
}
