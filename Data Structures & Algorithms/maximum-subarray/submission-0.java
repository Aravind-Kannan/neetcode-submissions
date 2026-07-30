class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0], runSum = nums[0];

        for(int i = 1; i < nums.length; i++)
        {
            maxSum = Math.max(maxSum, runSum);
            if(runSum < 0) runSum = nums[i];
            else runSum += nums[i];
        }

        return Math.max(maxSum, runSum);
    }
}
