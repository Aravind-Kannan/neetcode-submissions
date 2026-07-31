class Solution {
    int findMax(int[] nums, int curr)
    {
        int start = curr + 1, end = curr + nums[curr];
        int max = 1, maxIndex = -1;
        for(int i = start; i <= end && i < nums.length; i++)
        {
            if(max <= i + nums[i])
            {
                max = i + nums[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public boolean canJump(int[] nums) {
        int i = 0;
        while(i < nums.length - 1)
        {
            if(i + nums[i] >= nums.length - 1) return true;
            if(nums[i] == 0) break;
            i = findMax(nums, i);
        }
        return i == nums.length - 1;
    }
}
