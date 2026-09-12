class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();

        for(int i = 0; i < nums.length; i++)
        {
            if(seen.getOrDefault(target - nums[i], -1) != -1)
            {
                return new int[]{seen.getOrDefault(target - nums[i], -1), i};
            }
            seen.put(nums[i], i);
        }

        return new int[]{};
    }
}
