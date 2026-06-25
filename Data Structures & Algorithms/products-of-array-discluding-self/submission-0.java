class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] forwards = new int[n];
        int[] backwards = new int[n];
        int[] result = new int[n];

        forwards[0] = nums[0];
        backwards[n - 1] = nums[n - 1];

        for(int i = 1; i < n; i++)
        {
            forwards[i] = forwards[i - 1] * nums[i];
        }

        for(int i = n - 2; i >= 0; i--)
        {
            backwards[i] = backwards[i + 1] * nums[i];
        }

        result[0] = backwards[1];
        result[n - 1] = forwards[n - 2];

        for(int i = 1; i < n - 1; i++)
        {
            result[i] = forwards[i - 1] * backwards[i + 1];
        }

        return result;
    }
}  
