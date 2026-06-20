class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> m = new HashMap<>();

        for(int i = 0; i < nums.length; i++) 
        {
            m.put(nums[i], i);
        }

        for(int i = 0; i < nums.length; i++)
        {
            int j = m.getOrDefault(target - nums[i], -1);
            if(j != -1 && j != i)
            {
                return new int[]{i, m.get(target - nums[i])};
            }
        }

        return new int[]{};
    }
}
