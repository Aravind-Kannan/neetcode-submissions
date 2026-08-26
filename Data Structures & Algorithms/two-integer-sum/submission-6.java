class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,List<Integer>> s = new HashMap<>();

        for(int i = 0; i < nums.length; i++)
        {
            List<Integer> r = s.getOrDefault(nums[i], new ArrayList<Integer>());
            r.add(i);
            s.put(nums[i], r);
        }

        for(int i = 0; i < nums.length; i++)
        {
            List<Integer> indexSet = s.get(target - nums[i]);
            if(indexSet != null)
            {
                if(!indexSet.contains(i)) {
                    return new int[]{i, indexSet.get(0) };
                }

                if(indexSet.contains(i) && indexSet.size() > 1) {
                    for(int k: indexSet) {
                        if(k != i)
                        {
                            return new int[]{i, k};
                        }
                    }
                }
            }
        }

        return new int[]{};
    }
}
