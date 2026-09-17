class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        Set<List<Integer>> result = new HashSet<>();
        for(int i = 0; i < nums.length; i++)
        {
            int target = -(nums[i]);

            int l = 0, r = nums.length - 1;
            while(l < r)
            {
                int curSum = nums[l] + nums[r];

                if(curSum == target && l != i && r != i) {
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[l]);
                    triplet.add(nums[r]);
                    Collections.sort(triplet);
                    result.add(triplet);
                }

                if(curSum < target) {
                    l++;
                } else {
                    r--;
                }
            }
        }

        List<List<Integer>> r = new ArrayList<>();

        for(List<Integer> l : result)
        {
            r.add(l);
        }

        return r;
    }
}
