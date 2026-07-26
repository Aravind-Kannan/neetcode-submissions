class Solution {
    public int missingNumber(int[] nums) {
        int xor = 0;
        for(int i = 1; i <= nums.length; i++)
        {
            xor = xor ^ i;
        }

        int arrXor = nums[0];
        for(int i = 1; i < nums.length; i++)
        {
            arrXor = arrXor ^ nums[i];
        }

        return arrXor ^ xor;
    }
}
