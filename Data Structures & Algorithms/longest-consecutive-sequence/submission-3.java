class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int num: nums)
        {
            set.add(num);
        } 

        int max = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(set.contains(nums[i] - 1)) continue;
            int cur = 1, running = nums[i];
            while(set.contains(running + 1)) {
                cur++; running++;
            }
            max = Math.max(max, cur);
        }

        return max;
    }
}
