class Solution {
    public int hammingWeight(int n) {
        int i = 0, result = 0;
        while(n >> i > 0)
        {
            if((n >> i & 1) == 1) result++;
            i++;
        }
        return result;
    }
}
